package chuxiao.designpattern.factory;

import java.lang.reflect.Method;

public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(final SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(final String type){
        Pizza pizza = this.simplePizzaFactory.creatPizza(type);

        System.out.println(pizza.getName());

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Pizza is done");
    }

    //单元测试
    public static void main(String[] args) {

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        System.out.println("start!");
        pizzaStore.orderPizza("salt");
        System.out.println("end!");
        while(true){ }
    }


}
