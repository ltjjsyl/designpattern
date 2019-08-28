package designpattern.状态模式;
import	java.net.ContentHandler;

/**
 * 抽象状态角色
 * */
public abstract class State {

    //定义一个环境角色，状态切换，供子类访问
    protected Context context;

    //设置环境角色
    public void setContext(Context context){
        this.context = context;
    }

    //行为1  对应的状态去执行---行为
    protected abstract void handle1();

    //行为2
    protected abstract void handle2();
}
