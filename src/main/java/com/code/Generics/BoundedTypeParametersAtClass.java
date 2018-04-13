package com.code.Generics;

/**
 * Created by prem on 4/30/2017.
 */
public class BoundedTypeParametersAtClass<T extends Liquid> {
    private T liquid;
    public String getLiquidTaste(){
        return liquid.taste();
    }
}
