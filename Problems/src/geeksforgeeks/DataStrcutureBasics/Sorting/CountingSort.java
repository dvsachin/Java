package geeksforgeeks.DataStrcutureBasics.Sorting;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            long n = sc.nextLong();
            String arr =  sc.next();

            System.out.println(new CountingSort().countSort(arr));

        }

    }
    //Function to arrange all letters of a string in lexicographical
    //order using Counting Sort.
    public static String countSort(String arr) {
        // code here
        int n = arr.length();
        int k = 26;

        int[] count = new int[k];

        for(int i=0;i<k;i++)
            count[i] = 0;

        for(int i=0;i<n;i++)
            count[arr.charAt(i) - 'a']++;

        for(int i=1;i<k;i++)
            count[i] = count[i-1] + count[i];

        char[] output = new char[n];

        for(int i = n-1; i >= 0; i--) {
            output[count[arr.charAt(i) - 'a']-1] = arr.charAt(i);
            count[arr.charAt(i) - 'a']--;
        }

        return String.valueOf(output);
    }

}

/*
Given a string arr consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.

Example 1:

Input:
N = 5
S = "edsab"
Output:
abdes
Explanation:
In lexicographical order, string will be
abdes.
Example 2:

Input:
N = 13
S = "geeksforgeeks"
Output:
eeeefggkkorss
Explanation:
In lexicographical order, string will be
eeeefggkkorss.
Your Task:
This is a function problem. You only need to complete the function countSort() that takes string arr as a parameter and returns the sorted string. The printing is done by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 105
 */