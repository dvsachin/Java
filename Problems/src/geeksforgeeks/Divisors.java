package geeksforgeeks;

import java.util.Scanner;

public class Divisors {
    public static void divisor(int n){

        //Write your code here
        for(int i = 1; i <= n; i++ ) {
            if(n % i == 0)
                System.out.print(i+" ");
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        divisor(number);
    }
}
/*
Given an integer N. Write a program to print all the divisors of N.

Example 1:

Input:
N = 12
Output:
1 2 3 4 6 12
Explanation:
12 is divisible by 1 2 3 4 6 12.
Example 2:

Input:
N = 10
Output:
1 2 5 10
Explanation:
10 is divisible by 1 2 5 10.
Your Task:
The input n is provided as a parameter to the function divisor. Complete the given code so that it prints all the divisors in a single line.
 */
