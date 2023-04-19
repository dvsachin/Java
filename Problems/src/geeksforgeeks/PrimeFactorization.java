package geeksforgeeks;

import java.util.Scanner;

public class PrimeFactorization {
    public static void printPrimeFactorization(int n){
        // code here
        int temp = 0;
        for(int i = 2; i <= n; i++) {
            if(checkPrime(i)){
                temp = i;
                while (n % temp == 0) {
                    System.out.print(i+" ");
                    temp = temp * i;
                }
            }
        }
    }
    public static boolean checkPrime(int n){
        boolean flag = true;
        //Write your code here
        if(n < 2) flag = false;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) flag = false;
        }

        //returns a boolean value
        return flag;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        printPrimeFactorization(number);
    }

}
