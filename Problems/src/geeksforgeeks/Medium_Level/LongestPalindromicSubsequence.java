package geeksforgeeks.Medium_Level;

import geeksforgeeks.Easy_Level.ImplementTwoStacksInAnArray;

import java.util.Map;
import java.util.Scanner;

public class LongestPalindromicSubsequence {
    int lcs(String S1, String S2, int m, int n) {
        int L[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (S1.charAt(i - 1) == S2.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L[m][n];
    }
    public int longestPalinSubseq(String S) {
        //code here
        String reverseInput = new StringBuffer(S).reverse().toString();
        int result = lcs(S, reverseInput, S.length(), reverseInput.length());

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            System.out.println(new LongestPalindromicSubsequence().longestPalinSubseq(s));
        }
    }
}
/*
Given a String, find the longest palindromic subsequence.

Example 1:

Input:
S = "bbabcbcab"
Output: 7
Explanation: Subsequence "babcbab" is the
longest subsequence which is also a palindrome.
Example 2:

Input:
S = "abcd"
Output: 1
Explanation: "a", "b", "c" and "d" are
palindromic and all have a length 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function longestPalinSubseq() which takes the string S as input and returns an integer denoting the length of the longest palindromic subsequence of S.

Expected Time Complexity: O(|S|*|S|).
Expected Auxiliary Space: O(|S|*|S|).

Constraints:
1 ≤ |S| ≤ 1000
 */
