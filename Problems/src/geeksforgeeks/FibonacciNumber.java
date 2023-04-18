package geeksforgeeks;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacci(int n){

        //Write your code here to calculate
        //to calculate the nth fibonacci number
        int fact = 1;
        int a, b;
        a = b = 1;


        for(int i = 2; i < n; i++) {
            fact = a + b;
            a = b;
            b = fact;
        }
        return fact;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(fibonacci(number));
    }

}
