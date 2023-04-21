package FlowControl_Loops_Functions;

import java.util.Scanner;
public class TableOfANumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt(); // like given 10 will create multiples of a number 'n'

        for (int i=1; i<=m; i++) {
            System.out.println(i*n);
        }
    }
}

// FlowControl_Loops_Functions.TableOfANumber2 now using for loop