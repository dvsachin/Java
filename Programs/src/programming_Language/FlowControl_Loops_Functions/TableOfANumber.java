package programming_Language.FlowControl_Loops_Functions;

import java.util.Scanner;
public class TableOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i=1;
        while (i<11) {
            System.out.println(i*n);
            i=i+1;
        }
    }
}
// 10 numbers of n number