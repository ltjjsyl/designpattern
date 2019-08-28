package designpattern.状态模式;

/***
 * 具体的环境角色
 */
public class Context {
    public final static State STATE1 =new ConcreteState1();
    public final static State STATE2 =new ConcreteState2();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        //切换状态，其实是对状态初始化
        this.currentState.setContext(this);
    }

    public void handle1() {
        currentState.handle1();
    }

    public void handle2() {
        currentState.handle2();
    }
}
