package leetCode.Easy.String;
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int num;

        for(int i=0; i<s.length();) {
            if(i<s.length()-2 && s.charAt(i+2) == '#') {
                num = Integer.parseInt(s.substring(i,i+2));
                ans.append((char)(num+96));
                i+=3;
            }
            else {
                num = s.charAt(i) - 48;
                ans.append((char)(num+96));
                i++;
            }
        }
        return ans.toString();
    }
}
/*
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.



Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"


Constraints:

1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.
 */