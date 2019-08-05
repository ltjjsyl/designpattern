package designpattern.代理模式.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jixiaoqiang on 2017/7/4.
 */
public class TimeInvocationHandle implements InvocationHandler{

    //被代理对象
    private Object target;

    public TimeInvocationHandle(Object target) {
        this.target = target;
    }

    /**
     *
     *
     * @param proxy  被代理的对象
     * @param method 被代理的对象的方法
     * @param args   方法的参数
     * @return  方法的返回值
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("开始运行....");

        //调用被代理对象的方法   需要知道接口
        method.invoke(target);//没有参数

        System.out.println("结束运行....");
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间：" + (endTime - startTime));
        return null;
    }
}
