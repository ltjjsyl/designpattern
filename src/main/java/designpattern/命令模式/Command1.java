package designpattern.命令模式;


/**
 * 抽象的命令，定义接口
 * Receiver和Command 具体如何处理，根据实际情况而定
 *
 * 可以每个Command只定义一个Receiver,一个Receiver处理完一个Command的逻辑，
 * 这种方式理论上不需要ConcreteCommand,但是Client中要依赖Receiver
 *
 * 也可以每个Receiver处理自己固定的逻辑，由Command组合Receiver，这种更合理
 * */
//public  class Command1 implements Command{
//    private final Receiver receiver;
//
//    public Command1(Receiver receiver){
//        this.receiver = receiver;
//    }
//
//    public void execute() {
//        receiver.doSomeThing();
//    }
//}
