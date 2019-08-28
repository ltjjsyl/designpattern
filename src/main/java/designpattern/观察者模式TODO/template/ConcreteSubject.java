package designpattern.观察者模式TODO.template;

/**
 * 具体的目标对象
 */
public class ConcreteSubject extends Subject {
    //目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
