package geeksforgeeks.DataStrcutureBasics.Recursion;

import java.util.Properties;
import java.util.Scanner;

public class PrintOneToNWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            PrintOneToNWithoutLoop p = new PrintOneToNWithoutLoop();
            int N = sc.nextInt();
            p.printNos(N);
        }

    }
    public void printNos(int N) {
        //Your code here
        if(N == 0) return;

        printNos(N-1);
        System.out.print(N+" ");
    }
}

/*
Print numbers from 1 to N without the help of loops.

Example 1:

Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10

Example 2:

Input:
N = 5
Output: 1 2 3 4 5


Your Task:
This is a function problem. You only need to complete the function printNos() that takes N as parameter and prints number from 1 to N recursively. Don't print newline, it will be added by the driver code.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).


Constraints:
1 <= N <= 1000
 */