package com.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author prem chand shah on 13-05-2018
 * @project myJava
 */
public class sss {
    final static int MAX_SIZE = 256;

    /**
     * Find the first non-repeating character from a stream of characters
     */

    public static void getNonRepeatingCh(String s) {
        List<Character> l = new ArrayList<Character>();
        boolean[] repeated = new boolean[MAX_SIZE];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            //System.out.println(a);
            if (!repeated[a]) {
                if (!(l.contains(a))) {
                    l.add(a);
                } else {
                    l.remove((Character) a);
                    //	l.remove(a);
                    repeated[a] = true;
                }
            }

        }
        if (l.size() != 0) {
            System.out.print(l.get(0));
        } else {
            System.out.print("No such elements");
        }
    }

    public static void main(String[] args) {
        //String s = "saatish";j
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        getNonRepeatingCh(s);
    }

}

