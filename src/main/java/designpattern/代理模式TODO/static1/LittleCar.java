package designpattern.代理模式TODO.static1;

import java.util.Random;

/**
 * Created by jixiaoqiang on 2017/7/4.
 */
public class LittleCar implements Moveable {
    public void run() {
        System.out.println("running ...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
