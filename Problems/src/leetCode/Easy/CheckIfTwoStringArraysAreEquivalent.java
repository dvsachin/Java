package leetCode.Easy;

import java.util.Arrays;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer  temp1  = new StringBuffer();
        StringBuffer temp2 = new StringBuffer();

        for(int i=0; i<word1.length; i++) {
            temp1.append(word1[i]);
        }
        for(int i=0; i<word2.length; i++) {
            temp2.append(word2[i]);
        }

        if(temp1.toString().equals(temp2.toString())) return true;
        else return false;
    }
}
/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.



Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true


Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
 */