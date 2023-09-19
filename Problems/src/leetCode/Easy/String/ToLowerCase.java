package leetCode.Easy.String;
// https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >=65 && ch <= 90)
                ans.append((char)(ch+32));
            else
                ans.append(ch);
        }
        return ans.toString();
    }
}
/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.



Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"


Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.
 */