package designpattern.代理模式.muke.basic;

import java.util.Random;

public class Car implements Moveable {
	public void move() {
		//ʵ�ֿ���
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ��....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
