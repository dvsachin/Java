package geeksforgeeks.Hard_Level;

import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/number-of-distinct-subsequences0909/1
public class NumberOfDistinctSubsequences {
    int distinctSubsequences(String s) {
        // code here
        int mod = 1000000007;
        int n = s.length();

        // Initialize an array to store the count of distinct subsequences
        long[] dp = new long[n + 1];

        // Initialize dp[0] to 1 since an empty subsequence is always present
        dp[0] = 1;

        // Create an array to store the last index of each character in the string
        int[] lastIdx = new int[26];
        Arrays.fill(lastIdx, -1);

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % mod;

            // If the current character has occurred before, subtract the count of subsequences
            // that end with the last occurrence of the character
            char c = s.charAt(i - 1);
            if (lastIdx[c - 'a'] != -1) {
                dp[i] = (dp[i] - dp[lastIdx[c - 'a'] - 1] + mod) % mod;
            }

            // Update the last index of the current character
            lastIdx[c - 'a'] = i;
        }

        // Subtract 1 from the final result to exclude the empty subsequence
        return (int) ((dp[n] + mod) % mod);
    }
}

/*
Given a string consisting of lower case English alphabets, the task is to find the number of distinct subsequences of the string
Note: Answer can be very large, so, ouput will be answer modulo 109+7.

Example 1:

Input:
s = "gfg"
Output:
7
Explanation:
The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg" .
Example 2:

Input:
s = "ggg"
Output:
4
Explanation:
The four distinct subsequences are "", "g", "gg", "ggg".
Your task:
You do not need to read any input or print anything. The task is to complete the function distinctSubsequences(), which takes a string as input and returns an integer.

Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 ≤ |s| ≤ 105
s contains lower case English alphabets
 */