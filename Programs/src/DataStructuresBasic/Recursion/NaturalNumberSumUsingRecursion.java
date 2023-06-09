package DataStructuresBasic.Recursion;

import java.util.Scanner;

public class NaturalNumberSumUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println(naturalNumbersSum(n));

    }

    public static int naturalNumbersSum(int n) {
        if(n == 0) return 0;

        return n + naturalNumbersSum(n-1);
    }
}
// theta (n) time complexity
// theta (n) space complexity