package designpattern.单例模式;
import	java.util.Random;
import java.util.ArrayList;
import	java.util.List;

import static java.lang.Math.random;

//最好是不可变类
public class Multiple {
    private static final int maxNumOfInstance = 2;

    private static final List<Multiple> instances = new ArrayList<>();

    static {
        for (int i = 0; i < maxNumOfInstance; i++){
            instances.add(new Multiple("manager" + i));
        }
    }

    public static Multiple getInstance() {
        Random random = new Random();
        int val = random.nextInt(1000)%2;
        return instances.get(val);
    }

    private String name;

    private Multiple(String name){
        this.name = name;
    }

    private Multiple() {

    }
}


