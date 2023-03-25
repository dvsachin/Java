package geeksforgeeks;

import java.util.Scanner;

public class BitwiseOperators {
    static void bitWiseOp(int a, int b, int c) {

        // Your code here
        System.out.println(a^a);
        System.out.println(c^b);
        System.out.println(a & b);
        System.out.println(c | (a^a));
        System.out.println(~(c^b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        bitWiseOp(a,b,c);
    }
}
