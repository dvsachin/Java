package geeksforgeeks.School_Level;
// https://practice.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/1
public class SumOfOddAndEvenElements {
    public int[] find_sum(int n)
    {
        // Code here
        int evenSum = 0, oddSum = 0;
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) evenSum += i;
            else oddSum += i;
        }

        return new int[] {oddSum,evenSum};
    }
}
/*
Given an integer N, find the sum of odd numbers and even numbers from 1 to N.


Example 1:

Input: 5
Output: 9 6
Explanation: Odd numbers upto 5 are 1, 3, 5
and their sum = 1 + 3 + 5 = 9.Even numbers
upto 5 are 2 and 4 and their sum = 2 + 4 = 6.
Example 1:

Input: 6
Output: 9 12
Explanation: Odd numbers upto 6 are 1, 3, 5
and their sum = 1 + 3 + 5 = 9.Even numbers
upto 5 are 2 , 4 and 6 and their
sum = 2 + 4 + 6  = 12.


Your Task:

You don't need to read or print anything, Your task is to complete the function find_sum() which takes N as input parameter and returns a list of two numbers where first numbers is sum of odd numbers and second number is sum of even numbers.


Expected Time Complexity: O(1)
Expected Space Complexity: O(1)
 */
