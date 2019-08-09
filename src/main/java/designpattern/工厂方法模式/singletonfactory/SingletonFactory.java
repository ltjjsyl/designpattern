package designpattern.工厂方法模式.singletonfactory;

import java.lang.reflect.Constructor;

//工厂，单例
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
           Class c1 = Class.forName(Singleton.class.getName());
           //获取无参构造器
           Constructor constructor = c1.getDeclaredConstructor();
           //设置无参构造器是可访问的
           constructor.setAccessible(true);
           //产生一个实例
           singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
           //异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }

    private SingletonFactory(){
        super();
    }
}
