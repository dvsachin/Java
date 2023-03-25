package geeksforgeeks;

import java.util.Scanner;

public class APTerm {
    public static void utility(int a, int d, int n){
        //Complete the code above
        int ans = a + ((n-1)*d);
        //Complete the code above

        //The line below prints the output. Don't change it!
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        utility(a,d,n);

    }
}
