package DataStructuresBasic.Recursion;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitsSum(n));

    }

    private static int digitsSum(int n) {
        if (n < 10) return n;

        return n%10 + digitsSum(n/10);
    }
}
// TC = O(n) & SC = O(n) by recursion
//  TC = O(n) & SC = O(1) by iterative