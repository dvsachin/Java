package geeksforgeeks;

import java.util.Scanner;

public class LastDigit {
    public static void utility(int n){

        //just complete below statement
        int ans;
        if(n!= 0)
            ans = n%10;
        else
            ans = n;

        //below statement print the result
        System.out.println(Math.abs(ans));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();
        utility(a);
    }
}
