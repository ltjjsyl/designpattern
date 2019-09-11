package designpattern.门面模式;

//门面不参与子系统内的业务逻辑
public class Facade2 {

    //被委托的对象
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();


    //提供给外部访问的方法
    public void doSomethingA() {
        classA.doSomething();
    }

    public void doSomethingB() {
        classB.doSomething();
    }

    // 门面参与子系统内的业务逻辑
    public void doSomethingC() {
        classB.doSomething();
        classC.doSomething();
    }
}
