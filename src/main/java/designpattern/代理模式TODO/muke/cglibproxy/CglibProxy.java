package designpattern.代理模式TODO.muke.cglibproxy;

import java.lang.reflect.Method;
public class CglibProxy{}
//public class CglibProxy implements MethodInterceptor {
//
//	private Enhancer enhancer = new Enhancer();
//
//	public Object getProxy(Class clazz){
//		//���ô����������  ���������
//		enhancer.setSuperclass(clazz);
//		enhancer.setCallback(this);
//
//		return enhancer.create();//�����̳���
//	}
//
//	/**
//	 * ��������Ŀ���෽���ĵ���
//	 * m   Ŀ�귽���ķ������
//	 * args  �����Ĳ���
//	 * proxy�������ʵ��
//	 */
//	public Object intercept(Object obj, Method m, Object[] args,
//			MethodProxy proxy) throws Throwable {
//		System.out.println("��־��ʼ...");
//		//��������ø���ķ��� ���������
//		proxy.invokeSuper(obj, args);
//		System.out.println("��־����...");
//		return null;
//	}
//
//}
