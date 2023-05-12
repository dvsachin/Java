package geeksforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class NthFibonacciNumberUsingBigIntegers {
    public static BigInteger fib(int n) {

        //write your code here
        BigInteger first = new BigInteger("1");
        BigInteger second = new BigInteger("1");
        BigInteger nth = new BigInteger("1");


        for (int i = 2; i < n; i++) {
            nth = first.add(second);
            first = second;
            second = nth;
        }
        //return nth fibonacci number in BigInteger
        return nth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        System.out.println(fib(value));

    }
}
