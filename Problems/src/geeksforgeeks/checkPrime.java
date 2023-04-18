package geeksforgeeks;

import java.util.Scanner;

public class checkPrime {
    public static boolean prime(int n){
        boolean flag = true;
        //Write your code here
        if(n < 2) flag = false;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) flag = false;
        }

        //returns a boolean value
        return flag;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean ans = prime(number);
        if(ans) System.out.println("True");
        else System.out.println("False");
    }
}

/*
Given an integer n check if n is prime or not.
A prime number is a number that is divisible by 1 and itself only.

Example 1:

Input:
n = 17
Output:
True
Explanation:
17 is  divisible by  only 1 and 17.
So it's a prime number.
Example 2:

Input:
n = 56
Output:
False
Explanation:
56 is divisible by 2, 4, 7.....etc. So
its not a prime number.
Your Task:
The input n is provided as a parameter to the function prime. Complete the given code so that it returns a boolean value. Don't print anything.


Expected Time Complexity: O(n)
Expected Auxilary Space: O(n)

Contraints:â€‹
1 <= n <= 10000
 */