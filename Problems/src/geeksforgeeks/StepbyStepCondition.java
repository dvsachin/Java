package geeksforgeeks;

import java.util.Scanner;

public class StepbyStepCondition {
    static void isDivisibleByPrime (int n)
    {
        //Your code here
        if(n%11 == 0) System.out.print("Eleven");
        else if(n%3 == 0) System.out.print("Three");
        else if(n%2 == 0) System.out.print("Two");
        else System.out.print("-1");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        isDivisibleByPrime(number);
    }
}

/*
Sometimes, the normal if-else isn't enough. In such cases, we have what we call ladder if and else conditions.  So here we'll learn to use them.

Given a positive integer N. Your task is to check if it divisible as given below:
1. If it is divisible by 2, print "Two".
2. If it is divisible by 3, print "Three".
3. If it is divisible by 11, print "Eleven".
4. If not follow above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is largest.

Example 1:

Input:
3

Output:
Three
Example 2:

Input:
11

Output:
Eleven
Your Task:
Your task is to complete the function to check divisibility as required.

Constraints:
1 <= N <= 10^6
 */