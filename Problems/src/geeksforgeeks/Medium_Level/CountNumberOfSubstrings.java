package geeksforgeeks.Medium_Level;
// https://practice.geeksforgeeks.org/problems/count-number-of-substrings4528/1
public class CountNumberOfSubstrings {
    long substrCount (String S, int K) {
        // your code here
        return atMost(S,K)-atMost(S,K-1);
        // Exactly 'K' = (atMost K) - (atMost k-1)
        // if k = 3 then (atMost K) = upto 3 chars ( 0 to 3) substrings
        //  and (atMost k-1)  = upto 3-1 chars (0 to 2) substrings
        // after subtraction we will get exactly k chars substrings
    }
    long atMost(String s, int k){
        int[] arr = new int[26];

        int dist = 0, left = 0;
        long res = 0;

        for(int i=0; i<s.length(); i++){
            int temp1  = s.charAt(i)-'a';
            arr[temp1]++;
            if(arr[temp1]==1) dist++;

            while(dist>k){
                int temp2 = s.charAt(left)-'a';
                arr[temp2]--;
                if(arr[temp2]==0) dist--;
                left++;
            }

            res = res + (i-left+1);
        }
        return res;
    }
}
/*
Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that have exactly k distinct characters.

Example 1:

Input:
S = "aba", K = 2
Output:
3
Explanation:
The substrings are: "ab", "ba" and "aba".
Example 2:

Input:
S = "abaaca", K = 1
Output:
7
Explanation:
The substrings are: "a", "b", "a", "aa", "a", "c", "a".
Your Task:
You don't need to read input or print anything. Your task is to complete the function substrCount() which takes the string S and an integer K as inputs and returns the number of substrings having exactly K distinct characters.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ |S| ≤ 106
1 ≤ K ≤ 26
 */