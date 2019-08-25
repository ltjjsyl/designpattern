package designpattern.命令模式;

/**
 * 具体的命令
 * */
public class ConcreteCommand1 extends Command {
    //Receiver和Command 具体如何处理，根据实际情况而定

    //可以每个Command只定义一个Receiver,一个Receiver处理完一个Command的逻辑，
    //这种方式理论上不需要ConcreteCommand,但是Client中要依赖Receiver

    //也可以每个Receiver处理自己固定的逻辑，由Command组合Receiver，这种更合理
    private Receiver receiver1;
    private Receiver receiver2;

    public ConcreteCommand1(Receiver receiver1, Receiver receiver2){
       this.receiver1 = receiver1;
       this.receiver2 = receiver2;
    }

    public ConcreteCommand1(){
        this(new ConcreteReceiver1(), new ConcreteReceiver2());
    }

    @Override
    protected void execute() {
        receiver1.doSomeThing();
        receiver2.doSomeThing();
    }
}
