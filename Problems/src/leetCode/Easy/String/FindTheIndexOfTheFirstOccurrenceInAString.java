package leetCode.Easy.String;
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for(int i=0; i< haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0) && (i+needle.length())<= haystack.length()) {

                String temp = haystack.substring(i, (i + needle.length()));
                if(temp.equalsIgnoreCase(needle)) return i;
            }
        }
        return -1;
    }
}
/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

 */
