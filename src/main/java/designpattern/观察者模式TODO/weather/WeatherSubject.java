package designpattern.观察者模式TODO.weather;

import java.util.ArrayList;
import java.util.List;

/**
 *目标对象  他知道观摩他的观察者，并提供注册（添加）和删除观察者的接口
 */
public class WeatherSubject {
    private List<WeatherObserver> observers = new ArrayList<WeatherObserver>();


    //添加观察者的方法
    public void attach(WeatherObserver observer){
        observers.add(observer);
    }

    //删除观察者的方法
    public void detach(WeatherObserver observer){
        observers.remove(observer);
    }

    /**
     *通知所有的观察者对象
     */
    protected void notifyObservers(){
        for(WeatherObserver o: observers){
            o.update(this);
        }
    }
}
