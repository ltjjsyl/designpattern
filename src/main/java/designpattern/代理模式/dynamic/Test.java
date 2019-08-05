package designpattern.代理模式.dynamic;

import static1.LittleCar;
import static1.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by jixiaoqiang on 2017/7/4.
 */
public class Test {
    public static void main(String[] args) {
        LittleCar car = new LittleCar();
        InvocationHandler h = new TimeInvocationHandle(car);
        Class<?> cls = car.getClass();//LittleCar.class;
        /**
         * loader 类加载器
         * interfaces 实现接口
         * h InvocationHandler
         *
         * 返回值  实现接口代理实例
         */
        Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),
            cls.getInterfaces(), h);
        m.run();

    }
}
