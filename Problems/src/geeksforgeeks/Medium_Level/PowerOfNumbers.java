package geeksforgeeks.Medium_Level;

import geeksforgeeks.School_Level.ReplaceAll0sWith5;

import java.util.Scanner;
public class PowerOfNumbers {

    long power(int N,int R) {
        //Your code here
        long MOD = 1000000007;

        if(N == 0) return 0;
        if(R == 0) return 1;

        if(R%2 == 0) {
            long ans = power(N, R/2);
            return (ans % MOD * ans % MOD) % MOD;
        }
        else {
            long ans = power(N, (R-1)/2);
            return (ans % MOD * ans % MOD * N % MOD) % MOD;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = (int) rev(n);

            System.out.println(new PowerOfNumbers().power(n,r));

        }

    }
    public static long rev(long n) {
        long rev_num = 0;
        while (n>0) {
            rev_num = rev_num * 10 + n%10;
            n = n/10;
        }
        return rev_num;
    }
}
/**
 * Below equations are valid
     * (a * b) % m = ((a % m) * (b % m)) % m
     * (a + b) % m = ( (a % m) + (b % m)) % m
     *
     * // m is added to handle negative numbers
     * (a - b + m) % m = ( (a % m) - (b % m) + m) % m
     *
     * But,
     * (a / b) % m may NOT be same as ((a % m) / (b % m)) % m 7 4X
     * For example, a = 10, b = 5, m = 5.
     * (a / b) % m is 2, but ( (a % m) / (b % m)) % m
 */
// if R is odd then 5^9 => 5 * pow(5, 5^8/2)
// if R is even then 5^6 => pow(5, 5^6/2) Recursively

/*
Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:

Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
Example 2:

Input:
N = 12
Output: 864354781
Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.
Your Task:
You don't need to read input or print anything. You just need to complete the function pow() that takes two parameters N and R denoting the input number and its reverse and returns power of (N to R)mod(109 + 7).

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(LogN).

Constraints:
1 <= N <= 109
 */
