package geeksforgeeks;

import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b = scanner.nextInt();

        utility(a,b);
    }

    public static void utility(int a, int b){
        //code here
        int temp = a;
        a = b;
        b = temp;


        System.out.println(a+" "+b);
    }
}
