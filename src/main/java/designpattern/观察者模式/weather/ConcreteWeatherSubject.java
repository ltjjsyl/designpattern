package designpattern.观察者模式.weather;

/**
 * 具体的目标对象
 */
public class ConcreteWeatherSubject extends WeatherSubject {
    //目标对象的状态
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
