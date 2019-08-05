package designpattern.代理模式.muke.proxy;

import muke.basic.Moveable;

public class CarTimeProxy implements Moveable {

	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	private Moveable m;

	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ....");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ....  ������ʻʱ�䣺"
				+ (endtime - starttime) + "���룡");
	}

}
