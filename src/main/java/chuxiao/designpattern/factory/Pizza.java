package chuxiao.designpattern.factory;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pizza {
    private String name;

    public void prepare(){
        System.out.println("Making pizza: prepare");
    }

    public void bake(){
        System.out.println("Making pizza: bake");
    }

    public void cut(){
        System.out.println("Making pizza: cut");
    }

    public void box(){
        System.out.println("Making pizza: box");
    }
}
