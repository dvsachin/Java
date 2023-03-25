package geeksforgeeks;

import java.util.Scanner;

public class GPTerm {
    public static double termOfGP(int A,int B,int N)
    {
        //Your code here
        double commonDifference = Double.valueOf(B)/A;
        double ans = A * (Math.pow(commonDifference, N-1));

        return ans;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println((int)Math.floor(termOfGP(a,d,n)));
    }
}
