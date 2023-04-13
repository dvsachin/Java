package geeksforgeeks;

import java.util.Scanner;

/*
Given a natural number N. You have to find the number of digits in it.
 */
public class CountDigits {
    public static void countDigits(int n){
        int count = 0;
        //write your code here
        while(n > 0) {
            count++;
            n = n / 10;
        }
        //print number of digits in n
        System.out.print(count);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        countDigits(number);
        System.out.println();
    }
}
