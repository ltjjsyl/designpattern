package designpattern.门面模式;

// 门面参与子系统内的业务逻辑
public class Facade3 {

    //被委托的对象
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private Context context = new Context();


    //提供给外部访问的方法
    public void doSomethingA() {
        classA.doSomething();
    }

    public void doSomethingB() {
        classB.doSomething();
    }

    // 门面不参与子系统内的业务逻辑
    public void doSomethingC() {
        context.complexMethod();
    }
}

//封装类，提供隔离层，避免门面参与子系统内的业务逻辑
class Context {
    private ClassA classA = new ClassA();
    private ClassC classC = new ClassC();

    public void complexMethod() {
        classA.doSomething();
        classC.doSomething();
    }
}