package geeksforgeeks;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        //code here to calculate and return gcd of a and b
        int result = 1;
        int x = 0;

        if (a > b) x = b; // find min of a,b
        else x = a;

        for (int i = 1; i <= x; i++) { // 1 to min of a,b
            if (a % i == 0 && b % i == 0) result = i; // if a number divides both the numbers then it is a result
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int ans = gcd(number1, number2);
        System.out.println(ans);
    }
}
/*
Given two numbers A and B. The task is to find the GCD of  A and B.
The GCD of two numbers is the largest number that can divide both A and B perfectly.

Example 1:

Input:
A = 6
B = 9
Output:
3
Explanation:
After 3 there is no number that can
divide both 6 and 9 perfectly.
Example 2:

Input:
A = 10
B = 15
Output:
5
Explanation:
5 is the greatest common divisor of
10 and 15.
Your Task:
The input A and B are provided as parameters to the function gcd. Complete the given code so that it returns the gcd of A and B
Constraints:
1 ≤ A,B ≤ 100
 */
