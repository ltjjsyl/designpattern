package chuxiao.designpattern.factory;

public class SimplePizzaFactory {
    Pizza pizza = new Pizza();
    public Pizza creatPizza(final String type){
        Pizza pizza;
        if("salt".equals(type)){
            pizza= new Pizza();
        }

        return this.pizza;
    }
}
