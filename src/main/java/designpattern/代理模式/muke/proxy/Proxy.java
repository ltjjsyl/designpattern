package designpattern.代理模式.muke.proxy;

import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Proxy {
	
	@SuppressWarnings("unchecked")
	public static Object newProxyInstance(Class infce,InvocationHandler h) throws Exception{
		String rt = "\r\n";
		String methodStr = "";
		for(Method m : infce.getMethods()){
			methodStr += "" + rt +
			"	public void " + m.getName() + "() {" + rt +
			"  try{" + rt +
			"  Method md = " + infce.getName() + ".class.getMethod(\"" 
										+ m.getName() + "\");" + rt +
			"  h.invoke(this,md);" +rt+ 
			"  }catch(Exception e){ e.printStackTrace();}" + rt +
			"	}" ;
		}
		
		String str =
		"package muke.proxy;" + rt +
		"import java.lang.reflect.Method;" + rt +
		"import muke.proxy.InvocationHandler;" +  rt+
		"public class $Proxy0 implements " + infce.getName() + " {" + rt +
		"	public $Proxy0(InvocationHandler h) {" + rt +
		"		this.h = h;" + rt +
		"	}" + rt +
		"  private InvocationHandler h;" + rt+ 
		methodStr + rt +
		"}" ;
		//�����������java�ļ�
		String filename = System.getProperty("user.dir") +"/src/main/java/muke/proxy/$Proxy0.java";
		System.out.println(filename);
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str);
		
		//����
		//�õ�������
		JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
		//�ļ�������
		StandardJavaFileManager fileMgr = 
				complier.getStandardFileManager(null, null, null);
		//��ȡ�ļ�
		Iterable units = fileMgr.getJavaFileObjects(filename);
		//��������
		CompilationTask t = complier.getTask(null, fileMgr, null, null, null, units);
		//���б���
		t.call();
		fileMgr.close();

		//load ���ڴ�
		//Class c = Class.forName("muke.proxy.$Proxy0");  //��̬������ ����������java��
		//���ַ�����Ҳ�Ƕ�̬�� ��Ҫjava�ļ������ɺ�ſ���
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("muke.proxy.$Proxy0");

		Constructor ctr = c.getConstructor(InvocationHandler.class);
		return ctr.newInstance(h);

	}
}
