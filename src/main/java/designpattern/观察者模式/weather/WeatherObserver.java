package designpattern.观察者模式.weather;

/**
 * 观察者接口  定义一个更新接口给那些在目标对象发生改变的时候被通知的对象
 */
public interface WeatherObserver {
    public void update(WeatherSubject subject);
}
