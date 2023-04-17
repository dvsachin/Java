package geeksforgeeks;

import java.util.Scanner;

public class PrintSquare_StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        square(number);
        System.out.println();
    }
    public static void square(int s) {
        //Complete the code given below
        int count=s;
        for(int i=0;i<s;i++){
            if(i==0){
                count = s;
                while(count --> 0)System.out.print("* ");
            }
            else if(i == s-1){
                count=s;
                while(count --> 0)System.out.print("* ");
            }
            else{
                count = 2*s -3;
                System.out.print("*");

                while(count --> 0)System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/*
Given an integer S, write a program to print the square of size S using * character.
Input:
S = 4
Output:
****
*  *
*  *
****

Explanation:
It's a square! Each side contains S = 4 *.
Your Task: The function square takes S as a parameter. Use this s to make your square with S *
 */