package designpattern.观察者模式.template;

/**
 * 具体观察者对象
 */
public class ObserverImpl1 implements Observer{
    //观察者的状态
    private String observeState;
    //获取目标对象的状态 同步到观察者的状态
    public void update(Subject subject) {
        observeState = ((ConcreteSubject)subject).getSubjectState();
    }
}
