package designpattern.代理模式.static1.polymeric;

import designpattern.代理模式.static1.Moveable;

/**
 * 通过聚合的方式实现代理  实现共同的接口
 * 定义接口对象，传递不同实现接口对象，通过接口调用实现代理
 */
public class CarTimeProxy implements Moveable {
    private Moveable m;

    public CarTimeProxy(Moveable m) {
        this.m = m;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始运行....");
        //调用被代理对象的方法
        m.run();
        System.out.println("结束运行....");
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间：" + (endTime - startTime));
    }
}
