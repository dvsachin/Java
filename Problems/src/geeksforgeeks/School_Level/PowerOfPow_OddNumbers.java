package geeksforgeeks.School_Level;
// https://practice.geeksforgeeks.org/problems/power-of-pow-odd-numbers1103/1
public class PowerOfPow_OddNumbers {
    public long sum_of_square_oddNumbers(long n)  {
        // Code here
        return (n*(2*n+1)*(2*n-1)) / 3;
    }
}
/*
Given a single integer N, your task is to find the sum of the square of the first N odd natural Numbers.


Example 1:

Input: 2
Output: 10
Explanation: 12 + 32 = 10
Example 2:

Input: 3
Output: 35
Explanation: 12 + 32 + 52 = 35


Your Task:
You don't need to read or print anything. Your task is to complete the function sum_of_square_oddNumbers() which takes N as the input parameter and returns the sum of the first N odd natural numbers.


Expected Time Complexity: O(1)
Expected Space Complexity: O(1)

 */
