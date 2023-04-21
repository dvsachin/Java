package FlowControl_Loops_Functions;

import java.util.Scanner;

public class AllDivisorsOfANumber3 {
    static void printDivisors(int n) {
        int i = 1;

        // print all divisors from 1 (inclusive) to square root of n (exclusive) in n % i form
        // print all smaller divisors
        for(i=1; i*i < n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");
            }
        }

        // print all divisors from square root n (inclusive) to 1 (exclusive) in n / i form
        // print all greater divisors
        for(; i >= 1; i--)
        {
            if(n % i == 0)
            {
                System.out.print((n / i)+" ");
            }
        }
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        printDivisors(number);

    }
}

/*
Time = Theta(root(n)) + Theta(root(n)) = Theta(root(n))
Space = Theta(1)
 */