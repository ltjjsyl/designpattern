package designpattern.代理模式.static1.polymeric;

import designpattern.代理模式.static1.Moveable;
import designpattern.代理模式.static1.LittleCar;

/**
 * Created by jixiaoqiang on 2017/7/4.
 */
public class CarLogProxy implements Moveable {
    private Moveable m;

    public CarLogProxy(Moveable m) {
        this.m = m;
    }

    public void run() {
        System.out.println("开始记录");
        m.run();
        System.out.println("结束记录");
    }

    public static void main(String[] args) {
        Moveable m1 = new LittleCar();
        Moveable clp = new CarLogProxy(m1);
        Moveable ctp = new CarTimeProxy(clp);
        ctp.run();


    }
}
