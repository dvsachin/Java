package geeksforgeeks;

import java.util.Scanner;

public class DayBeforeNDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();
        int b = scanner.nextInt();

        utility(a,b);
    }
    public static void utility(int d, int n){
        //write your code here
        int result = (d - (n%7));

        if(result >=0)
            System.out.print(result);
        else
            System.out.print(result+7);

    }
}
