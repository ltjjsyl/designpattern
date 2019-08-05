package designpattern.观察者模式.weather;

/**
 * Created by jixiaoqiang on 2017/7/6.
 */
public class Client {
    public static void main(String[] args) {
        //创建个目标
        ConcreteWeatherSubject concreteWeatherSubject = new ConcreteWeatherSubject();
        //创建观察者
        WeatherObserverImpl1 observerGirl = new WeatherObserverImpl1();
        observerGirl.setObserveName("女朋友");
        observerGirl.setRemindThing("第一次见面");
        WeatherObserverImpl1 observerMom = new WeatherObserverImpl1();
        observerMom.setObserveName("Mom");
        observerMom.setRemindThing("购物");
        //注册观察者
        concreteWeatherSubject.attach(observerGirl);
        concreteWeatherSubject.attach(observerMom);
        //目标发布天气内容
        concreteWeatherSubject.setWeatherContent("阴转晴");
       //  concreteWeatherSubject.notifyObservers();
    }
}