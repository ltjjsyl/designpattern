package designpattern.状态模式;

/**
 * 具体状态角色
 * */
public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        //本状态必须的处理逻辑
        System.out.println("ConcreteState1 handle1.");
    }

    @Override
    public void handle2() {
        //切换状态，设置当前的状态
        super.context.setCurrentState(Context.STATE2);
        //过渡到该状态，由Context实现，执行处理逻辑
        super.context.getCurrentState().handle2();
    }
}
