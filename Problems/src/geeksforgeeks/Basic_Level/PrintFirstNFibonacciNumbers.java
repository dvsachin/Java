package geeksforgeeks.Basic_Level;
// https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1
public class PrintFirstNFibonacciNumbers {
    public static long[] printFibb(int n)
    {
        //Your code here
        long[] ans = new long[n];

        if(n==1) return new long[]{1};
        if(n==2) return new long[]{1,1};

        int a = 1;
        int b = 1;
        int c = a+b;

        ans[0] = a;
        ans[1] = b;
        ans[2] = c;

        for(long i=3; i<=n; i++) {
            ans[(int)i-1] = c;
            a = b;
            b = c;
            c = a+b;
        }
        return ans;
    }
}
/*
Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13
Your Task:
Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Note: This space is used to store and return the answer for printing purpose.

Constraints:
1<= N <=84
 */