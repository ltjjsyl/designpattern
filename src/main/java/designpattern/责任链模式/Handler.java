package designpattern.责任链模式;


/**
 * 抽象处理者
 */
public abstract class Handler {
    private Handler nextHandler;

    public final Response handleMessage(Request request){
        Response response = null;

        //判断是否是自己的处理级别
        if(getHandlerLevel().equals(request.getRequestLevel())){
            response = proceess(request);
        }else {
            //不属于自己的处理级别，判断是否有下一处理者
            if(nextHandler != null){
                response = nextHandler.handleMessage(request);
            }else {
                //没有适当的处理者，业务自行处理，默认的处理策略
            }
        }

        return response;
    }

    //设置下一处理者是谁
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    //每个处理者都必须实现处理任务
    protected abstract Response proceess(Request request);
}
