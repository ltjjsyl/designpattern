package designpattern.状态模式;

public class Context1 {
    private State1 currentState;

    public State1 getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State1 currentState) {
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
