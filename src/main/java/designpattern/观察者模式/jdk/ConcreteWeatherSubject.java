package designpattern.观察者模式.jdk;

import java.util.Observable;

/**
 * 天气目标的具体实现类
 */
public class ConcreteWeatherSubject extends Observable {
    public String getContent() {
        return content;
    }

    private String content;

    public void setContent(String content) {
        this.content = content;
        //天气有了，通知所有对象
        //在通知之前这句话不可少
        this.setChanged();

        //推模式  有参数
        this.notifyObservers(content);
//        //拉模式  二者只能用一个
//        this.notifyObservers();
    }
}
