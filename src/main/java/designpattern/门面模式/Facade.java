package designpattern.门面模式;

//门面对象
public class Facade {
    //被委托的对象
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();


    //提供给外部访问的方法
    public void doSomethingA(){
        classA.doSomething();
    }

    public void doSomethingB(){
        classB.doSomething();
    }

    public void doSomethingC(){
        classC.doSomething();
    }
}
