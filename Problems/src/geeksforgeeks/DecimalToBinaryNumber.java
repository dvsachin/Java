package geeksforgeeks;

import java.util.Scanner;

public class DecimalToBinaryNumber {
    public static void toBinary(String N) {
        // Code here
        int value = Integer.parseInt(N.trim());
        StringBuffer sb = new StringBuffer();

        while (value > 0) {
            sb.append(value % 2);
            value /= 2;
        }

        System.out.print(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

       toBinary(str);
    }
}

/*
Given a decimal number N in string format, compute its binary equivalent.


Example 1:

Input: N = 7
Output: 111
Example 2:

Input: N = 33
Output: 100001

Your Task:
You have to print its binary form. Don't need to add new line. Complete the function toBinary() which takes the decimal number N as input parameter and prints its binary equivalent.
 */
