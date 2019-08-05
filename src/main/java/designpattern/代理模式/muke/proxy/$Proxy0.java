package designpattern.代理模式.muke.proxy;
import java.lang.reflect.Method;
public class $Proxy0 implements muke.basic.Moveable {
	public $Proxy0(InvocationHandler h) {
		this.h = h;
	}
  private InvocationHandler h;

	public void move() {
  try{
  Method md = muke.basic.Moveable.class.getMethod("move");
  h.invoke(this,md);
  }catch(Exception e){ e.printStackTrace();}
	}
}