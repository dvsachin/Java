package programming_Language.FlowControl_Loops_Functions;

import java.util.Scanner;
// Efficient Solution but print divisors pair in non-sorted order
public class AllDivisorsOfANumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        printDivisors(number);

    }
    public static void printDivisors(int number) {
// one divisor which is smaller is always present till square root of n
// like for n = 30, divisors : (1,30) (2,15) (3,10) (5,6)
// smaller one are 1,2,3,5 <= square root (30) = 5.477
        for(int i =  1; i*i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i+" ");

                if ( i != number/i)
                    System.out.print((number/i)+" "); // do not print number 2 times for perfect squares

            }
        }
    }
}

