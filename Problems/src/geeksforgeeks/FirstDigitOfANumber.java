package geeksforgeeks;

import java.util.Scanner;

public class FirstDigitOfANumber {
    public static int firstDigit(int n){
        // code here
        while(n>=10) {
            n = n/10;
        }
        return n;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(firstDigit(number));
    }
}
/*
Given a number N, find the first digit of the number.

Example 1:

Input:
N = 123
Output:
1


Example 2:

Input:
N = 976
Output:
9
Your Task:

Your task is to complete the function firstDigit() which takes an integer N as parameters and returns the first digit of N.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 109
 */