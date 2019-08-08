package designpattern.工厂方法模式;

import designpattern.工厂方法模式.common.Product;

//静态工厂方法
public class StaticFactory {
    public  static  <T extends Product>T createProduct(Class<T> c) {
        Product product = null;
        try {
            product =  (Product) Class.forName(c.getName()).newInstance();//必须有无参构造器
        } catch (Exception e) {
            //异常处理
        }

        return (T) product;
    }
}
