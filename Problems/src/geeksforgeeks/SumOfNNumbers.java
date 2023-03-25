package geeksforgeeks;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();

        System.out.println(nSum(a));
    }
    public static int nSum(int n){
        int ans = 0;

        //Write your code here to calculate and return sum of n number.
        ans = n*(n+1)/2;

        return ans;
    }
}

