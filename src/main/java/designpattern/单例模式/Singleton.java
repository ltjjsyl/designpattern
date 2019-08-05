package designpattern.单例模式;

/**
 * 饿汉模式，线程安全
 * */
public class Singleton {
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton(){}

    public static void otherMethod() {

    }
}
