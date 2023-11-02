package geeksforgeeks.Medium_Level;
// https://www.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1
public class MaximumSumIncreasingSubsequence {
    public int maxSumIS(int arr[], int n)  	{
        // Your code goes here
        int[] dp = new int[n];
        int res = arr[0];
        for(int i=0; i<n; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j]) max = Math.max(max,dp[j]);
            }
            dp[i] = max+arr[i];
            res = Math.max(dp[i],res);
        }
        return res;

    }
    
}


/*
Given an array of n positive integers. Find the sum of the maximum sum subsequence of the given array such that the integers in the subsequence are sorted in strictly increasing order i.e. a strictly increasing subsequence.

Example 1:

Input:
N = 5, arr[] = {1, 101, 2, 3, 100}
Output:
106
Explanation:
The maximum sum of a increasing sequence is obtained from {1, 2, 3, 100},
Example 2:

Input:
N = 4, arr[] = {4, 1, 2, 3}
Output:
6
Explanation:
The maximum sum of a increasing sequence is obtained from {1, 2, 3}.
Your Task:
You don't need to read input or print anything. Complete the function maxSumIS() which takes N and array arr as input parameters and returns the maximum value.

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 103
1 ≤ arr[i] ≤ 105


 */