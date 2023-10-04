package geeksforgeeks.Medium_Level;
// https://practice.geeksforgeeks.org/problems/column-name-from-a-given-column-number4244/1
public class ColumnNameFromAGivenColumnNumber {
    String colName (long n) {
        // your code here
        StringBuffer ans = new StringBuffer();

        while(n > 0) {
            char ch = (char) ('A' + (n-1) % 26); // // n-1 means A denotes when n%26 = 0
            ans.append(ch);
            n =  (n - 1) / 26;
        }
/*
        StringBuilder sb = new StringBuilder();
        while (n-- >0) { // n-- means A denotes when n%26 = 0
            sb.append((char) 'A'+(n%26));
            n = n/26;
        }
        return sb.reverse().toString();
*/
        return ans.reverse().toString();
    }
}

/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.
Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA” and so on.

Example 1:

Input:
N = 28
Output: AB
Explanation: 1 to 26 are A to Z.
Then, 27 is AA and 28 = AB.

Example 2:

Input:
N = 13
Output: M
Explanation: M is the 13th character of
alphabet.
Your Task:
You don't need to read input or print anything. Your task is to complete the function colName() which takes the column number N as input and returns the column name represented as a string.
Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 1018


 */