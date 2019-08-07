package designpattern.策略模式.common;

//封装角色
public class Context {
    private Strategy strategy;

    //构造函数设置具体策略
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //setter函数设置具体策略
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    //执行具体的策略
    public void doing(){
        strategy.doSomething();
    }
}
