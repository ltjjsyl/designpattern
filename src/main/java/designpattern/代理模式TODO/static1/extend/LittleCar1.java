package designpattern.代理模式TODO.static1.extend;

import designpattern.代理模式TODO.static1.LittleCar;

/**
 * 通过继承实现某个接口的类来实现代理
 */
public class LittleCar1 extends LittleCar {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("开始运行....");
        //调用被代理对象的方法
        super.run();
        System.out.println("结束运行....");
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间："+(endTime - startTime));
    }
}
