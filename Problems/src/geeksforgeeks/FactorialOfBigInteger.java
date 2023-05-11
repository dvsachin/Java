package geeksforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfBigInteger {
    public static BigInteger factorial(int x) {


        //return factorial of x as datatype of BigInteger
        BigInteger fact = new BigInteger("1");

        for (int i = 2; i <= x; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        System.out.println(factorial(value));
    }
}
