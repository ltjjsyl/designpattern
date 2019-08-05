package designpattern.代理模式.muke.proxy;

import muke.basic.Car;
import muke.basic.Moveable;

public class Client {

	/**
	 * ������
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class,h);
		m.move();
	}

}
