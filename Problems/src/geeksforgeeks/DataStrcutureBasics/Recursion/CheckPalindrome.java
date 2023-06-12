package geeksforgeeks.DataStrcutureBasics.Recursion;

import geeksforgeeks.checkPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            System.out.println(new CheckPalindrome().isPalin(n));
        }
    }
    static boolean isPalin(int N) {
        // Check if the number is palindrome or not
        //You may use a helper function if you like
        if(N == reverse(N,0))
            return true;
        else
            return false;
    }

    private static int reverse(int n, int rev) {
        if(n == 0) return rev;

        rev = rev *10 + n%10;

        return reverse(n/10, rev) ;
    }

}
/*
You are given a number n. You need to see if the number is a palindrome or not (recursively)

Example 1:

Input:
n = 100
Output: 0
Example 2:

Input:
n = 101
Output: 1
Your Task:

Complete the function isPalin that takes n as parameter and returns true or false . (In case of true, 1 will be printed by the driver code, otherwise 0)

Expected Time Complexity: O(Log(N)).
Expected Auxiliary Space: O(Log(N)) (Recursive).

Constraints:
1 <= n <= 108
 */