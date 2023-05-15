package geeksforgeeks;

import java.math.BigInteger;
import java.util.Scanner;

public class NextPrimeNumberBigInteger {
    public static int nextPrime(int n){

        //write your code here
        //Use BigInteger to solve
        BigInteger nextP = BigInteger.valueOf(n).add(BigInteger.ONE);

        while(true) {
            if(checkPrime(nextP)) break;
            nextP =  nextP.add(BigInteger.ONE);
        }

        return nextP.intValue();

    }

    public static boolean checkPrime(BigInteger N) {
        boolean flag = true;
        BigInteger itr;

        if( N.compareTo(BigInteger.TWO) == -1) flag = false;
        for (itr =  BigInteger.TWO; (itr.multiply(itr)).compareTo(N) == -1 ||
                (itr.multiply(itr)).equals(N); itr =  itr.add(BigInteger.ONE)) {
            if( N.remainder(itr).equals(BigInteger.ZERO)) flag = false;
        }

        return flag;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(nextPrime(number));

    }
}

/*
Given an integer n. Write a program to find the prime number next to n.

Example 1:

Input:
n = 15
Output:
17
Explanation:
17 is next prime number.
Example 2:

Input:
n = 7
Output:
11
Explanation:
11 is the prime number next to 7.
Your Task:
The input n is provided as a parameter to the function nextPrime. Complete the given code so that it returns the next Prime Number
 */