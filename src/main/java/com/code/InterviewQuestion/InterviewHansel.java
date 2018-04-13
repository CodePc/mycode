package com.code.InterviewQuestion;

/**
 * Created by prem on 4/1/2017.
 */
public class InterviewHansel {
    //Question 1: Given a string, write a program to find out whether it is a palindrome or not. Palindrome is a string that is same when read from both sides. For example, “DAD”, “MADAM” etc. Do not use “reverse” function for this.

//    Answer

    public void isPalindrome(String str) {

        int length = str.length();
        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end) / 2;

        for (i = begin; i <= middle; i++) {
            if (str.charAt(begin) == str.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }


//    Question 2: Given two strings, a and b, write a program to find out whether b exists in a as a substring
//    A = CATER ER
//    B = CATER


    //    Answer

    public boolean issubString(String a, String b, int aL, int bL) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        if (bL == 0)
            return true;
        if (aL == 0)
            return false;
        if (aa[aL - 1] == bb[bL - 1]) {
            return issubString(String.valueOf(aa), String.valueOf(bb), aL - 1, bL - 1);
        }
        return issubString(String.valueOf(aa), String.valueOf(bb), aL - 1, bL);
    }


//    Question 3: Given a string and a character, find out the index of first three occurrences of that character in the string.

    //    Answer

    public void charOccurrences(String s[], char c) {
        int len = s.length;
        int counter = 0;
        for (int i = 0; i < len - 1; i++) {
            if (s[i].charAt(i) == c) {
                System.out.println(i);
                counter++;
                if (counter == 3)
                    break;
            }
        }
    }

    public static void main(String[] args) {
        InterviewHansel interviewHansel = new InterviewHansel();
        String s1 = "ddacdaaa";
        String s2 = "cda";
        if (interviewHansel.issubString(s1, s2, s1.length(), s2.length()))
            System.out.println("Yes");
        else
            System.out.println("NO");
        interviewHansel.isPalindrome("panpap");
    }
}
