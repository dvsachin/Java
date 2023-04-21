package FlowControl_Loops_Functions;

import java.util.Scanner;
// Naive Solution
public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        printDivisors(number);

    }
    public static void printDivisors(int number) {

        for(int i =  1; i<= number; i++) {
            if(number%i == 0) System.out.println(i);
        }
    }
}

/*
Time = Theta(n)
Space = Theta(1)
 */