package geeksforgeeks.School_Level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ReplaceAll0sWith5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(new ReplaceAll0sWith5().convertfive(n));
        }
    }
    int convertfive(int num) {
        // Your code here
        int temp = 0, digit=1;

        while (num>0) {
            if (num %10 == 0)
                temp = temp + 5 * digit;
            else
               temp =  temp + num%10 * digit;

            num/=10;
            digit*=10;
        }
        return temp;
    }
}
/*
You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:

Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:

Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000
 */