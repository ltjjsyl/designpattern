package designpattern.观察者模式.jdk;

/**
 * Created by jixiaoqiang on 2017/7/7.
 */
public class Client {
    public static void main(String[] args) {
        //创建一个天气目标对象   被观察者
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();

        //创建观察者
        ConceteObserver girl = new ConceteObserver();
        girl.setObserveName("女朋友");

        ConceteObserver mon = new ConceteObserver();
        mon.setObserveName("Mom");

        //注册观察者
        subject.addObserver(girl);
        subject.addObserver(mon);

        //目标更新天气情况
        subject.setContent("阴转晴");

    }
}
