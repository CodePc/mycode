package com.code;

import com.code.Generics.InheritanceWithGenrics;
import com.code.Generics.Liquid;
import com.code.Generics.TestInterFace;

/**
 * Created by prem on 4/30/2017.
 */
public class InterfaceImplemeation implements Liquid, TestInterFace {
    @Override
    public String taste() {
        return "interface";
    }

    @Override
    public void method() {
        System.out.println("overridden method 2");
    }

    public void M1(){

    }
    public static void main(String[] args) {
        Liquid liquid = new InterfaceImplemeation();
        InheritanceWithGenrics inheritanceWithGenrics = new InheritanceWithGenrics();
//        inheritanceWithGenrics.liquid;
//        inheritanceWithGenrics
//        System.out.println(inheritanceWithGenrics.);
        liquid.taste();
    }
}

