package com.code.Generics;

/**
 * Created by prem on 4/30/2017.
 */
public class MultipleBoundedTypeParameter<T extends Guest & Liquid> { // concrete class should come 1st and than interface
    private T liquid;
}

class orangeJuce extends Guest implements Liquid {
    @Override
    public String taste() {
        return "orangeJuice";
    }

    public static void main(String[] args) {
        MultipleBoundedTypeParameter<orangeJuce> multipleBoundedTypeParameter = new MultipleBoundedTypeParameter();
//        MultipleBoundedTypeParameter<appleJuice> multipleBoundedTypeParameter1 = new MultipleBoundedTypeParameter<>(); // Invalid
        // this is invalid because appleJuice class only extend Guest class but don't implement liquid interface
    }
}

class appleJuice extends Guest {
// i m not implementing liquid interface so cannot create a instance of above class type
}
