package designpattern.观察者模式TODO.template;

import java.util.ArrayList;
import java.util.List;

/**
 *目标对象  他知道观摩他的观察者，并提供注册（添加）和删除观察者的接口
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();


    //添加观察者的方法
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除观察者的方法
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     *通知所有的观察者对象
     */
    protected void notifyObservers(){
        for(Observer o: observers){
            o.update(this);
        }
    }
}
