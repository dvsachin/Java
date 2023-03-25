package geeksforgeeks;

import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();
        int b = scanner.nextInt();

        utility(a,b);
    }
    public static void utility(int a, int b){

        //just complete below statement
        int ans = a>>b;

        //print the result
        System.out.println(ans);
    }
}
