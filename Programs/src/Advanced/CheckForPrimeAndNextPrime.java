package Advanced;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckForPrimeAndNextPrime {
    public static boolean isPrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(n);
    }

    public static int isProbablePrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        String s = b.nextProbablePrime().toString();

        return Integer.parseInt(s);
    }

    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isProbablePrime(n));
    }
}
