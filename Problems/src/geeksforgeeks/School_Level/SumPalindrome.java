package geeksforgeeks.School_Level;
// https://practice.geeksforgeeks.org/problems/sum-palindrome3857/1
public class SumPalindrome {
    static long isSumPalindrome(long n){
        // code here
        long newNumber = n;
        long temp = n, reverse = 0;

        if(rev(n) == n)  return n;

        for(int i=0; i<5; i++) {

            reverse = rev(temp);

            newNumber = reverse + newNumber;

            if(rev(newNumber) == newNumber)  return newNumber;
            else {
                temp = newNumber;
                reverse = 0;
            }
        }
        return -1;

    }
    static long rev(long temp) {
        long reverse = 0;

        while(temp > 0) {
            reverse = reverse * 10 + temp %10;
            temp = temp / 10;
        }
        return reverse;
    }
}

/*
Given a number, reverse it and add it to itself unless it becomes a palindrome or number of iterations becomes more than 5.

Example 1:

Input: n = 23
Output: 55
Explanation: reverse(23) = 32,then 32+23
= 55 which is a palindrome.

Example 2:
Input: n = 30 Output: 33
Explanation: reverse(30) = 3,then 3+30
= 33 which is palindrome.

Example 3:
Input: n = 101 Output: 101

Example 4:
Input: n = 73 Output: 121

Example 5:
Input: n = 4762 Output: -1
 */