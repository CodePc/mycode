package com.recursion;

/**
 * @author prem chand shah on 27-04-2018
 * @project myJava
 */
public class Factorial {


    public static int fact(int n) {
        int sum = 0;
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        else
            sum = n * fact(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.fact(5));
    }
}
