package leetCode.Easy.String;
// https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public void reverseString(char[] s) {
        int m = 0, n = s.length-1;
        char ch = ' ';

        while(m<=n) {
            ch = s[m];
            s[m] = s[n];
            s[n] = ch;

            m++;
            n--;
        }
    }
}
/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */