package designpattern.观察者模式TODO.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jixiaoqiang on 2017/7/7.
 */
public class ConceteObserver implements Observer {
    private  String observeName;

    public String getObserveName() {
        return observeName;
    }

    public void setObserveName(String observeName) {
        this.observeName = observeName;
    }

    public void update(Observable o, Object arg) {
        //推模式
        System.out.println(observeName+"推模式：收到了"+arg);
        //拉模式
        System.out.println(observeName+"拉模式：收到了"+((ConcreteWeatherSubject)o).getContent());
    }
}
