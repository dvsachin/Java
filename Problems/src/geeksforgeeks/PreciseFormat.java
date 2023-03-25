package geeksforgeeks;

import java.util.Scanner;

public class PreciseFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a  = scanner.nextFloat();
        float b = scanner.nextFloat();

        printInFormat(a,b);
    }
    static void printInFormat(float a, float b){
        float result = a/b;


        // Your code here to print upto 3 decimal places
        System.out.print(result+" ");
        System.out.printf("%.3f",result);

    }
}
