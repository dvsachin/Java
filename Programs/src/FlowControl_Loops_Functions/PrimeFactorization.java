package FlowControl_Loops_Functions;

import java.util.Scanner;

public class PrimeFactorization {
    public static boolean isPrime(int n){
        if(n==1)
            return false;

        if(n==2 || n==3)
            return true;

        if(n%2==0 || n%3==0)
            return false;

        for(int i=5; i*i<=n; i=i+6) {
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void printFactors(int n) {
        for( int i = 2; i <= n; i++ ) {
            if( isPrime(i) ) {  // check prime number or not
                int x = i;  // change x value with prime number - i
                while( n%x == 0 ) {  // if it is prime then it is divisible by x (current prime or more of its factors) number or not
                    System.out.print(i+" ");
                    x = x*i; // increment x with i for more factors of same number
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printFactors(n);
    }
}

/*
n = 100
output will be all its prime factors - so divide 100 from 2 to 100 prime numbers in between range
100/2 50/2
output: 2 2
Next checkPrime(3) iff yes then is it divisible or not, 25 is not divisible by 3 so skip it
next is 4 and checkPrime(4) iff true then check is it divisible or not iif divide it else skip it
next prime number is 5
25/5 5/5
output: 5 5
so final output will be
2 2 5 5

if input number is prime then output will be same as input => 97 gives you 97
 */