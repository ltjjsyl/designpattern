package designpattern.命令模式;

/**
 * 接收者角色，具体的执行者
 * */
public class ConcreteReceiver1 extends Receiver {

    @Override
    public void doSomeThing() {
        //每个接收者都必须处理一定的业务逻辑
        System.out.println("ConcreteReceiver1 doSomeThing.");
    }
}
