package designpattern.状态模式;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setCurrentState(Context.STATE1);

        context.handle1();
        context.handle2();
    }
}
