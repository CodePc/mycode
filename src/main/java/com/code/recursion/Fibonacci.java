package com.code.recursion;

import java.util.Arrays;

/**
 * @author prem chand shah on 12-05-2018
 * @project myJava
 */
public class Fibonacci {

    public static int fib(int n) {
        if (n == 0)
            return n;
        if (n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }


    public static int topdownDp(int n, int mem[]) {
        Arrays.fill(mem, -1);
        if (n == 0 || n == 1) {
            mem[n] = n;
            return n;
        }
        if (mem[n] != -1) {
            return mem[n];
        } else {
            mem[n] = fib(n - 1) + fib(n - 2);
            return mem[n];
        }

    }

    public static void main(String[] args) {
        System.out.println("this is  dp \n" + Fibonacci.topdownDp(35, new int[100]));
        System.out.println("This not DP \n" + Fibonacci.fib(35));

    }

}
