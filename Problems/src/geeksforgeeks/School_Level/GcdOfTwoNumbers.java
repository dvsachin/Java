package geeksforgeeks.School_Level;

import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- >0) {
            int  A = sc.nextInt();
            int  B = sc.nextInt();

            System.out.println(new GcdOfTwoNumbers().gcd(A,B));
        }
    }
    public int gcd(int A , int B)  {
        //code here
        if (A == 0)
            return B;

        return gcd(B % A, A);
    }
}
/*
Given two positive integers A and B, find GCD of A and B.


Example 1:

Input: A = 3, B = 6
Output: 3
Explanation: GCD of 3 and 6 is 3

Example 2:

Input: A = 1, B = 1
Output: 1
Explanation: GCD of 1 and 1 is 1

Your Task:
You don't need to read input or print anything. Complete the function gcd() which takes two positive integers as input parameters and returns an integer.


Expected Time Complexity: O(log(min(A, B)))
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ A, B ≤ 109


 */