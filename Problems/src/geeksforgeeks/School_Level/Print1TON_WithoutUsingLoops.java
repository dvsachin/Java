package geeksforgeeks.School_Level;

import java.util.Scanner;

public class Print1TON_WithoutUsingLoops {
    static void printTillN(int N){
        // code here

        if(N == 0) return;
        printTillN(N-1);
        System.out.print(N+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- >0) {
            int  N = sc.nextInt();
            new Print1TON_WithoutUsingLoops().printTillN(N);
            System.out.println();
        }
    }
}
