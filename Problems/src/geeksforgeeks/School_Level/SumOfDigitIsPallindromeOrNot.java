package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitIsPallindromeOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            System.out.println(new SumOfDigitIsPallindromeOrNot().isDigitSumPalindrome(n));
        }
    }
    int isDigitSumPalindrome(int N) {
        // code here
        int digitSum = 0, curr = 0;

        while(N>0) {
            curr = N%10;
            digitSum = digitSum + curr;
            N = N/10;
        }

        if(checkPalindrome(digitSum)) return 1;
        else return 0;
    }
    static boolean checkPalindrome(int n)  {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }
}
/*
Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Example 1:

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is 1.
Example 2:

Input:
N=98
Output:
0
Explanation:
The digit sum of 98 is 9+8=17.
Since 17 is not a palindrome,thus, answer
is 0.

Your Task:
You don't need to read input or print anything.Your Task is to complete the function isDigitSumPalindrome() which takes a number N as input parameter and returns 1 if the Digit sum of N is a palindrome.Otherwise it returns 0.


Expected Time Complexity:O(LogN)
Expected Auxillary Space:O(1)

Constraints:
1<=N<=109
 */