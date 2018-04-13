package com.code.Generics;

/**
 * Created by prem on 4/30/2017.
 */
public class MultiTypeParameter<R, G, B> { // multiple type parameters
    public MultiTypeParameter() {
    }

    public MultiTypeParameter(R red, G green, B blue) {
    }


    public static class Red {
    }

    static class Green {
    }

    static class Blue {
    }

    public static void main(String[] args) {
        Red red = new Red();
        Green green = new Green();
        Blue blue = new Blue();
        MultiTypeParameter<Red, Green, Blue> multiTypeParameter = new MultiTypeParameter<>(red, green, blue); // This has refereace of
        // red , green , blue class as it is of genric we have defned it to take
        MultiTypeParameter multiTypeParameter1 = new MultiTypeParameter(); // default constructor
        MultiTypeParameter<String, String, String> str = new MultiTypeParameter<>("prem", "Chand", "Shah"); // as it is a genric glass it took
        //it is fine with String object
    }
}
