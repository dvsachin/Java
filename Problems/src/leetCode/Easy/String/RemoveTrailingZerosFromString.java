package leetCode.Easy.String;
// https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
public class RemoveTrailingZerosFromString {
    public String removeTrailingZeros(String num) {
        StringBuilder ans = new StringBuilder();

        int idx = num.length();
        for(int i=num.length()-1; i>=0; i--) {
            if(num.charAt(i) != '0')  {
                idx = i;
                break;
            }
        }
        return num.substring(0,idx+1);
    }
}
/*
Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.



Example 1:

Input: num = "51230100"
Output: "512301"
Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
Example 2:

Input: num = "123"
Output: "123"
Explanation: Integer "123" has no trailing zeros, we return integer "123".


Constraints:

1 <= num.length <= 1000
num consists of only digits.
num doesn't have any leading zeros.
 */