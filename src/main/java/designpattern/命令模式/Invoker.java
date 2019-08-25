package designpattern.命令模式;

/**
 * 调用者
 * */
public class Invoker {
    private Command command;

    public Invoker() {

    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
