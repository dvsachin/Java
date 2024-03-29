package leetCode.Easy.String;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuffer ans = new StringBuffer();

        while(columnNumber > 0) {
            char ch = (char) ('A' + (columnNumber-1) % 26);
            ans.append(ch);
            columnNumber =  (columnNumber - 1) / 26;
        }

        return ans.reverse().toString();
    }
}
/*
https://leetcode.com/problems/excel-sheet-column-title/

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"

 */
