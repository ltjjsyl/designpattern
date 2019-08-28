package designpattern.状态模式;

public enum State1 {

    STATE1{
        @Override
        protected void handle1() {

        }

        @Override
        protected void handle2() {
            //切换状态，设置当前的状态
            super.context.setCurrentState(STATE2);
            //过渡到该状态，由Context实现，执行处理逻辑
            super.context.getCurrentState().handle2();
        }
    },
    STATE2{
        @Override
        protected void handle1() {
            //切换状态，设置当前的状态
            super.context.setCurrentState(STATE1);
            //过渡到该状态，由Context实现，执行处理逻辑
            super.context.getCurrentState().handle1();

        }

        @Override
        protected void handle2() {

        }
    };

    //定义一个环境角色，状态切换，供子类访问
    protected Context1 context;

    //设置环境角色
    public void setContext(Context1 context){
        this.context = context;
    }

    //行为1  对应的状态去执行---行为
    protected abstract void handle1();

    //行为2
    protected abstract void handle2();
}
