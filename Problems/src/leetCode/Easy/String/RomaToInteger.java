package leetCode.Easy.String;

import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/problems/roman-to-integer/

public class RomaToInteger {
    public int romanToInt(String s) {
        int ans = 0;
        Map<Character,Integer> romans = new HashMap<>();
        romans.put('I',1); romans.put('V',5);romans.put('X',10);romans.put('L',50);
        romans.put('C',100);romans.put('D',500);romans.put('M',1000);

        // add a last character value in ans
        ans = romans.get(s.charAt(s.length()-1));

        // start from 2nd last element to compare values
        for(int i=s.length()-2; i>=0; i--) {
            // if left (current) element is smaller then subtract
            if(romans.get(s.charAt(i)) < romans.get(s.charAt(i+1)))
                ans = ans - romans.get(s.charAt(i));
            else
                // if right (i+1) element is smaller then addition
                ans = ans + romans.get(s.charAt(i));
        }

        //  IV => I < V = 1 < 5 true then subtract 1 from 5
        //  VI => V < I = 5 < 1 false then add 1 to 5
        return ans;

    }
}
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 */
