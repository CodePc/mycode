package com.code;

/**
 * Created by prem on 4/17/2017.
 */
public class ReverseString {
    // convert sting into character array using toCharArray()
    // print all the array element from last index to 1st
    // or replace 1st element of array with last and last with 1st and so on
    public void reverseTheString(String s, int size) {
//      s.toCharArray()
    }

    public static void main(String[] args) {
        String str = "Kishan";
        int size = str.length();
        ReverseString reverseString = new ReverseString();
        reverseString.reverseTheString(str, size);
    }

    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }

    public static String reverseString(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    // reverse the words of string

    public static void reverse(String string) {
        // Using treditonal approach
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result = result + string.charAt(i);
        }
        System.out.println(result);

        // Using StringBufferTest class
        StringBuffer buffer = new StringBuffer(string);
        System.out.println(buffer.reverse());
    }

    public static void reverseStringByWords(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split(" ");

        for (int j = words.length - 1; j >= 0; j--) {
            stringBuilder.append(words[j]).append(' ');
        }
        System.out.println("Reverse words: " + stringBuilder);
    }

    public void reverseString() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String reverseAlphabet = reverse(alphabet, alphabet.length() - 1);
    }

    String reverse(String stringToReverse, int index) {
        if (index == 0) {
            return stringToReverse.charAt(0) + "";
        }

        char letter = stringToReverse.charAt(index);
        return letter + reverse(stringToReverse, index - 1);
    }

    {
//        public  void rs () {
//            String s1 = "neelendra";
//            for(int i=s1.length()-1;i>=0;i--)
//            {
//                System.out.print(s1.charAt(i));
//            }
//        }

    }


    /*1.(A XOR B) XOR B = A

2.(A XOR B) XOR A = B */


    public void usingBitOperation() {

        String str = "prateek";
        reverseUsingXOR(str.toCharArray());
    }

    /*Example:
     * str= prateek;
     * str[low]=p;
     * str[high]=k;
     * str[low]=p^k;
     * str[high]=(p^k)^k =p;
     * str[low]=(p^k)^p=k;
     *
     * */
    public static void reverseUsingXOR(char[] str) {
        int low = 0;
        int high = str.length - 1;

        while (low < high) {
            str[low] = (char) (str[low] ^ str[high]);
            str[high] = (char) (str[low] ^ str[high]);
            str[low] = (char) (str[low] ^ str[high]);
            low++;
            high--;
        }

        //display reversed string
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }

//    void reverse(char *str)
//    {
//        if (*str)
//        {
//            reverse(str+1);
//            printf("%c", *str);
//        }
//    }str
}
