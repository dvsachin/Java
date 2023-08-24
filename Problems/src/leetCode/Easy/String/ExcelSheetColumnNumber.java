package leetCode.Easy.String;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        // char[] ch = columnTitle.toCharArray();
        int len = columnTitle.length();
        int ans = 0;

        for(int i=0; i<len; i++) {
            int d = columnTitle.charAt(i) - 'A' + 1;
            ans = ans * 26 + d;
        }

        // for(char curr : ch) {
        //     int d = curr - 'A' + 1;
        //     ans = ans * 26 + d;
        // }

        return ans;
    }
}
/*
https://leetcode.com/problems/excel-sheet-column-number/


Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701

 */
