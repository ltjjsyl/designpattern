package designpattern.单例模式;

/**
 * 线程安全的延迟加载
 * */
public class Singleton1 {

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return Holder.instance;
    }

    private static class Holder {
        public static final Singleton1 instance = new Singleton1();
    }
}
