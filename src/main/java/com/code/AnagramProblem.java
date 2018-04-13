package com.code;

/**
 * Created by prem on 5/2/2017.
 */
public class AnagramProblem {
//  /*  public static void main(String[] args) {


//        // sorting method
//    -------------------------------
//
//        /*// C/C++ program to check whether two strings are anagrams
//// of each other
//#include <stdio.h>
//#include <string.h>
//
///* Function prototype for string a given string using
//   quick sort */
//        void quickSort(char *arr, int si, int ei);
//
///* function to check whether two strings are anagram of
//   each other */
//        bool areAnagram(char *str1, char *str2)
//        {
//            // Get lenghts of both strings
//            int n1 = strlen(str1);
//            int n2 = strlen(str2);
//
//            // If length of both strings is not same, then they
//            // cannot be anagram
//            if (n1 != n2)
//                return false;
//
//            // Sort both strings
//            quickSort(str1, 0, n1 - 1);
//            quickSort(str2, 0, n2 - 1);
//
//            // Compare sorted strings
//            for (int i = 0; i < n1;  i++)
//                if (str1[i] != str2[i])
//                    return false;
//
//            return true;
//        }
//
//// Following functions (exchange and partition are needed
//// for quickSort)
//        void exchange(char *a, char *b)
//        {
//            char temp;
//            temp = *a;
//            *a   = *b;
//            *b   = temp;
//        }
//
//        int partition(char A[], int si, int ei)
//        {
//            char x = A[ei];
//            int i = (si - 1);
//            int j;
//
//            for (j = si; j <= ei - 1; j++)
//            {
//                if(A[j] <= x)
//                {
//                    i++;
//                    exchange(&A[i], &A[j]);
//                }
//            }
//            exchange (&A[i + 1], &A[ei]);
//            return (i + 1);
//        }
//
///* Implementation of Quick Sort
//A[] --> Array to be sorted
//si  --> Starting index
//ei  --> Ending index
//*/
//        void quickSort(char A[], int si, int ei)
//        {
//            int pi;    /* Partitioning index */
//            if(si < ei)
//            {
//                pi = partition(A, si, ei);
//                quickSort(A, si, pi - 1);
//                quickSort(A, pi + 1, ei);
//            }
//        }
//
///* Driver program to test to print printDups*/
//        int main()
//        {
//            char str1[] = "test";
//            char str2[] = "ttew";
//            if (areAnagram(str1, str2))
//                printf("The two strings are anagram of each other");
//            else
//                printf("The two strings are not anagram of each other");
//
//            return 0;
//        }*/ */

//---------------------

    // Hashing Method

//    bool areAnagram(char *str1, char *str2)
//    {
//        // Create 2 count arrays and initialize all values as 0
//        int count1[NO_OF_CHARS] = {0};
//        int count2[NO_OF_CHARS] = {0};
//        int i;
//
//        // For each character in input strings, increment count in
//        // the corresponding count array
//        for (i = 0; str1[i] && str2[i];  i++)
//        {
//            count1[str1[i]]++;
//            count2[str2[i]]++;
//        }
//
//        // If both strings are of different length. Removing this
//        // condition will make the program fail for strings like
//        // "aaca" and "aca"
//        if (str1[i] || str2[i])
//            return false;
//
//        // Compare count arrays
//        for (i = 0; i < NO_OF_CHARS; i++)
//            if (count1[i] != count2[i])
//                return false;
//
//        return true;
//    }
//
//    /* Driver program to test to print printDups*/
//    int main()
//    {
//        char str1[] = "geeksforgeeks";
//        char str2[] = "forgeeksgeeks";
//        if ( areAnagram(str1, str2) )
//            printf("The two strings are anagram of each other");
//        else
//            printf("The two strings are not anagram of each other");
//
//        return 0;
//    }

//    -------------------------
    // single hash Table:

//bool areAnagram(char *str1, char *str2)
//{
//    // Create a count array and initialize all values as 0
//    int count[NO_OF_CHARS] = {0};
//    int i;
//
//    // For each character in input strings, increment count in
//    // the corresponding count array
//    for (i = 0; str1[i] && str2[i];  i++)
//    {
//        count[str1[i]]++;
//        count[str2[i]]--;
//    }
//
//    // If both strings are of different length. Removing this condition
//    // will make the program fail for strings like "aaca" and "aca"
//    if (str1[i] || str2[i])
//        return false;
//
//    // See if there is any non-zero value in count array
//    for (i = 0; i < NO_OF_CHARS; i++)
//        if (count[i])
//            return false;
//    return true;
//}


}
