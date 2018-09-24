package com.code;

/**
 * Created by prem on 4/25/2017.
 */
class BlankFinal {
    // We can initialize here, but if we
    // initialize here, then all objects get
    // the same value.  So we use blank final
    final int i;

    public BlankFinal(int x) {
        // Since we have initialized above, we
        // must initialize i in constructor.
        // If we remove this line, we get compiler
        // error.
        i = x; // can be initialized only in constructor method
    }

    public void num(int j) {
//          i = j;
        // Invalid cannot initialize  in  method, it can only be initialized into constructor method
    }


    public static void main(String[] args) {
        BlankFinal blankFinal = new BlankFinal(20);
        System.out.println(blankFinal.i);
        BlankFinal blankFinal1 = new BlankFinal(30);
        System.out.println(blankFinal1.i);
    }
}

