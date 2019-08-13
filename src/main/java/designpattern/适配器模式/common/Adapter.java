package designpattern.适配器模式.common;

//适配器角色，通过继承、实现或组合实现源角色和目标角色的关联
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
