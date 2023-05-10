package geeksforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerOperations {
    static BigInteger add(BigInteger x, BigInteger y){
        // Your code here
        BigInteger C = x.add(y);
        return C;
    }
    static BigInteger mul(BigInteger x, BigInteger y){
        // Your code here
        return x.multiply(y);
    }
    static BigInteger mod(BigInteger x, BigInteger y){
        // Your code here
        return y.remainder(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger value1 = sc.nextBigInteger();
        BigInteger value2 = sc.nextBigInteger();

        System.out.println("add: "+add(value1,value2));
        System.out.println("multiply: "+mul(value1,value2));
        System.out.println("reminder: "+mod(value1,value2));


    }

}

