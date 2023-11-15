package geeksforgeeks.Hard_Level;

import java.util.Arrays;
// https://www.geeksforgeeks.org/problems/better-string/1
public class BetterString {
    public static String betterString(String str1, String str2) {
        // Code here
        int res1 = distinctSubsequences(str1);
        int res2 = distinctSubsequences(str2);
        // System.out.println(res1+" "+res2);
        if(res1>=res2) return str1;
        return str2;

    }
    static int distinctSubsequences(String S) {
        // code here
        int n = S.length();
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        int ans = 0, diff = 0;

        for(int i=0; i<n; i++){
            int x = S.charAt(i)-'a';
            if(i==0){
                ans = 1;
                arr[x] =1;
                continue;
            }
            diff = 1+ans;
            if(arr[x]==-1) ans = ans+diff;
            else ans = ans+diff-arr[x];
            arr[x] = diff;
        }
        return ans+1;
    }
}
/*
Given a pair of strings of equal lengths, Geek wants to find the better string. The better string is the string having more number of distinct subsequences.
If both the strings have equal count of distinct subsequence then return str1.

Example 1:

Input:
str1 = "gfg", str2 = "ggg"
Output: "gfg"
Explanation: "gfg" have 7 distinct subsequences whereas "ggg" have 4 distinct subsequences.
Example 2:

Input: str1 = "a", str2 = "b"
Output: "a"
Explanation: Both the strings have only 1 distinct subsequence.
Your Task:
You don't need to read input or print anything. Your task is to complete the function betterString() which takes str1 and str2 as input parameters and returns the better string.

Expected Time Complexity: O( max( str1.length, str2.length ) )

Expected Auxiliary Space: O( max( str1.length, str2.length ) )

Constraints:
1 <= str1.length , str2.length <= 30
 */