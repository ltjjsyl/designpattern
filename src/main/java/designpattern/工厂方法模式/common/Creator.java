package designpattern.工厂方法模式.common;

//抽象工厂类
public abstract class Creator {

    //创建一个产品类，器输入参数可以自行设定
    //通常为Stirng/Enum/Class等，当然也可以设置为空
    public abstract  <T extends Product> T createProduct(Class<T> c);
}
