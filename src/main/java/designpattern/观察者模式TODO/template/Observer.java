package designpattern.观察者模式TODO.template;

/**
 * 观察者接口  定义一个更新接口给那些在目标对象发生改变的时候被通知的对象
 */
public interface Observer {
    public void update(Subject subject);
}
