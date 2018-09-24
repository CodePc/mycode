package com.code.String;

/**
 * @author prem chand shah on 03-05-2018
 * @project myJava
 */
public class FindFreqChar {

    public static void freqChar(String str) {
        int c = 0, count[] = new int[26], x;
        char[] s = str.toCharArray();
        for (char cc : s) {
            /** Considering characters from 'a' to 'z' only and ignoring others. */

            if (s[c] >= 'a' && s[c] <= 'z') {
                x = s[c] - 'a';
                count[x]++;
            }

            c++;
        }

        for (c = 0; c < 26; c++)
            System.out.println(("%c occurs %d times in the string.\n" + c + 'a' + count[c]));
    }


    public static void main(String[] args) {
        FindFreqChar.freqChar("ashjdbjhaksjdn");
    }
}
