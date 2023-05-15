package geeksforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckPrimeBigInteger {
    public static boolean prime(int n){

        //write your code here
        //Use BigInteger to solve the problem
        boolean flag = true;
        BigInteger itr;
        BigInteger N = BigInteger.valueOf(n);


        if(n < 2) flag = false;
        for (itr =  BigInteger.TWO; (itr.multiply(itr)).compareTo(BigInteger.valueOf(n)) == -1 ||
            (itr.multiply(itr)).equals(BigInteger.valueOf(n)); itr =  itr.add(BigInteger.ONE)) {
                if( N.remainder(itr).equals(BigInteger.ZERO)) flag = false;
        }

        return flag;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean ans = prime(number);
        if(ans) System.out.println("True");
        else System.out.println("False");
    }
}
