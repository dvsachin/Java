package Advanced;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialUsingBigInteger {
    public static BigInteger factorial(int a){
        BigInteger bi = new BigInteger("1"); // initializing a BigInteger value

        for(int i = 2; i <= a; i++){
            BigInteger x = BigInteger.valueOf(i); // converting i into BigInteger to multiply
            bi = bi.multiply(x);
        }
        return bi;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt(); // testcase value

        while(testcase -- > 0){
            //Taking input a
            int a = sc.nextInt(); // factorial value

            System.out.println(factorial(a));
        }
    }
}
