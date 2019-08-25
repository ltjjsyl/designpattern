package designpattern.命令模式;


public class Client {
    public static void main(String[] args) {
        //创建调用者
        Invoker invoker = new Invoker();

        //把命令交给调用者,客户端不接触Receiver
        Command command = new ConcreteCommand1();
        invoker.setCommand(command);

        //调用者执行
        invoker.action();
    }


}
