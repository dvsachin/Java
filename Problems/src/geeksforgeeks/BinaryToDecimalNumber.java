package geeksforgeeks;

import java.util.Scanner;

public class BinaryToDecimalNumber {
    public static int binary_to_decimal(String str) {
        // Code here
        int decimalNumber = 0;
        int power = 1;
        for (int i = str.length()-1; i >= 0; i--) {
            decimalNumber +=  (str.charAt(i) - '0') * power;
            power *= 2;
        }

         return  decimalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(binary_to_decimal(str));
    }
}
/*
Given a Binary Number B, find its decimal equivalent.


Example 1:

Input: B = 10001000
Output: 136
Example 2:

Input: B = 101100
Output: 44


Your Task:
You don't need to read or print anything. Your task is to complete the function binary_to_decimal() which takes the binary number as string input parameter and returns its decimal equivalent.


Expected Time Complexity: O(K * Log(K)) where K is number of bits in binary number.
Expected Space Complexity: O(1)


Constraints:
1 <= number of bits in binary number  <= 16
 */