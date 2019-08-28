package designpattern.模板方法模式;

public class Client {
    public static void main(String[] args) {
        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        ConcreteClass2 concreteClass2 = new ConcreteClass2();

        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}
