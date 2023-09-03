package leetCode.Easy.String;
// https://leetcode.com/problems/add-binary/
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int carry = 0;

        for(int i=0; (i<a.length() || i < b.length() || carry != 0); i++) {
            int temp1 = 0;
            if(i < a.length() && a.charAt(a.length()-i-1)== '1') temp1 = 1;

            int temp2 = 0;
            if(i<b.length() && b.charAt(b.length()-i-1)=='1') temp2 = 1;

            ans.append((temp1+temp2+carry)%2);
            carry = (temp1+temp2+carry)/ 2;
        }
        return ans.reverse().toString();
    }
}

/*
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

 */