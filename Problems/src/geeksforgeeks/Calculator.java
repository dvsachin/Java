package geeksforgeeks;

import java.util.Scanner;

/*
Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator.

If operator equals to 1 add a and b, then print the result.

If operator equals to 2 subtract b from a, then print the result.

If operator equals to 3 multiply a and b, then print the result.

If operator equals to any another number, print "Invalid Input"(without quotes).
 */
public class Calculator {
    public static void utility(int a, int b, int operator) {

        //write your code here
        switch (operator) {
            case 1:
                System.out.print(a + b);
                break;

            case 2:
                System.out.print(a - b);
                break;

            case 3:
                System.out.print(a * b);
                break;

            default:
                System.out.print("Invalid Input");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int operator = scanner.nextInt();

        utility(number1,number2,operator);
        System.out.println();
    }
}
