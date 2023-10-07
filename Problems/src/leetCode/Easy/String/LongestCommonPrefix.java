package leetCode.Easy.String;
// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Find the minimum length among all strings
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        StringBuilder commonPrefix = new StringBuilder();

        // Compare characters at the same position in all strings
        for (int i = 0; i < minLen; i++) {
            char currentChar = strs[0].charAt(i);  // Get the character from the first string
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }
}
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */