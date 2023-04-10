import java.util.Scanner;
// Efficient Solution but print divisors pair in non-sorted order
public class AllDivisorsOfANumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        printDivisors(number);

    }
    public static void printDivisors(int number) {

        for(int i =  1; i*i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i+" ");

                if ( i != number/i)
                    System.out.print((number/i)+" "); // do not print number 2 times for perfect squares

            }
        }
    }
}

