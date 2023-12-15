package geeksforgeeks.Easy_Level;
// https://www.geeksforgeeks.org/problems/reach-the-nth-point5433/1
public class ReachTheNthPoint {
    public int nthPoint(int n)  {
        // Code here
        int mod = 1000000007;
        int a = 1, b=2;
        if(n<3) return n;
        for(int i=3; i<=n; i++){
            int temp = a;
            a = b%mod;
            b = (temp+b)%mod;
        }
        return b;
    }
}
/*
There are N points on the road, you can step ahead by 1 or 2 . If you start from a point 0, and can only move from point i to point i+1 after taking a step of length one, find the number of ways you can reach at point N.

Example 1:

Input:
N = 4
Output:
5
Explanation: Three ways to reach at 4th
point. They are {1, 1, 1, 1}, {1, 1, 2},
{1, 2, 1} {2, 1, 1}, {2, 2}.

Example 2:

Input: N = 5
Output: 8
Explanation: Three ways to reach at 5th
point. They are {1, 1, 1, 1, 1},
{1, 1, 1, 2}, {1, 1, 2, 1}, {1, 2, 1, 1},
{2, 1, 1, 1}{1, 2, 2}, {2, 1, 2}, {2, 2, 1}
Your Task:
You don't need to read or print anyhting. Your task is to complete the function nthPoint() which takes N as input parameter and returns the total number of ways modulo 109 + 7 to reach at Nth point.

Expected Time Complexity: O(N)
Expected Space Complexity: O(N)

Constraints:
1 ≤ N ≤ 105


 */