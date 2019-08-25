package designpattern.命令模式;

public class ConcreteCommand2 extends Command{
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver){
        this.receiver = receiver;

    }

    public ConcreteCommand2(){
        this(new ConcreteReceiver1());
    }

    @Override
    protected void execute() {
        receiver.doSomeThing();

    }
}

