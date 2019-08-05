package designpattern.代理模式.muke.proxy;

import java.lang.reflect.Method;

public interface InvocationHandler {
	public void invoke(Object o, Method m);
}
