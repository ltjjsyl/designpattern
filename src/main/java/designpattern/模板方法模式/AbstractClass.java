package designpattern.模板方法模式;

public abstract class AbstractClass {

    //基本方法，具体由子类实现决定
    protected abstract void basicMethod1();
    //基本方法，具体由子类实现决定
    protected abstract void basicMethod2();
    //钩子函数，有选择决定执行的逻辑
    protected abstract boolean isXXX();


    //模板方法，不允许改变
    public final void templateMethod(){
        //调用基本的方法，完成相关的逻辑
        basicMethod1();
        if(isXXX()){
            basicMethod2();
        }

    }
}
