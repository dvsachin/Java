package geeksforgeeks;

import java.util.Scanner;

public class LogicalOperators {
    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        System.out.print(a && b);
        System.out.print(" "+(a || b));
        System.out.print(" "+((!a) && (!b)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean a  = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        logicOp(a,b);
    }
}
