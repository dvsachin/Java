package leetCode.Easy.String;
// https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int count = 0, temp = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'L') temp++;
            else if(s.charAt(i) == 'R') temp--;

            if(temp == 0) count++;
        }
        if(temp == 0) return count;
        else return 1;

    }
}
/*
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.



Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".



 */