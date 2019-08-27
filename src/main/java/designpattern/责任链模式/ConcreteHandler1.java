package designpattern.责任链模式;

/**
 * 具体的处理者1
 * */
public class ConcreteHandler1 extends Handler {
    @Override
    public Level getHandlerLevel() {
        //设置自己的处理级别
        return null;
    }

    @Override
    protected Response proceess(Request request) {
        //完成处理逻辑
        return null;
    }
}
