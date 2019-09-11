package designpattern.门面模式;

//访问权限比Facade小
public class Facade1 {
    //委托方式，减少重复代码，提供唯一入口
    private Facade facade = new Facade();

    public void doSomethingB(){
        facade.doSomethingB();
    }
}
