package designpattern.观察者模式TODO.weather;

/**
 * 具体观察者对象
 */
public class WeatherObserverImpl1 implements WeatherObserver {

    //观察者名字
    private String observeName;

    //天气情况
    private  String weatherContent;
    //提醒的内容
    private  String remindThing;

    public String getObserveName() {
        return observeName;
    }

    public void setObserveName(String observeName) {
        this.observeName = observeName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }


    //获取目标对象的状态 同步到观察者的状态
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.println(observeName + "收到了"+ weatherContent +"," +remindThing);
    }
}
