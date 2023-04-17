package geeksforgeeks;

import java.util.Scanner;

public class TableDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        difference(number1, number2);
        System.out.println();
    }
    public static void difference(int n1, int n2){
        int product1, product2 = 0;
        //Write your code here
        for(int i = 1; i <= 10; i++) {
             product1 = n1*i;
             product2 = n2*i;
            System.out.print(product1 - product2+" ");
        }


    }
}
/*
Given two number n1 and n2, n1 > n2. Find the differences between mathematical tables of n1 and n2.

Example 1:

Input:
n1 = 9, n2 = 4
Output:
5 10 15 20 25 30 35 40 45 50
Explanation:
9 - 4 = 5, 18 - 8 = 10 , 27 - 12 = 15,
36 - 16 = 20, 45 - 20 = 25, 54 - 24 = 30,
63 - 28 = 35, 72 - 32 = 40, 81 - 36 = 45,
90 - 40 = 50.

Your Task: The n1 and n2 are provided as parameters to the function difference. Your task is write the code at the mentioned place so that your code prints the difference of mathematical tables of n1 and n2 in a single line.
 */
