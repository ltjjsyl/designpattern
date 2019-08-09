package designpattern.工厂方法模式;
import	java.util.HashMap;

import designpattern.工厂方法模式.common.ConcreteProduct1;
import designpattern.工厂方法模式.common.ConcreteProduct2;
import designpattern.工厂方法模式.common.Product;

import java.util.Map;

//池化
public class ProductFactory {
    private static final Map<String, Product> productMap = new HashMap<> ();

    public static synchronized Product createProduct(String type) {
        Product product = null;
        //Map中如果缓存了，直接取出
        if(productMap.containsKey(type)){
            product = productMap.get(type);
        }else {
            if(type.equals("Product1")){
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            //把对象缓存到map中
            productMap.put(type, product);
        }

        return product;
    }
}
