package leetCode.Easy.String;
// https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String def = "[.]";
        StringBuffer ans  = new StringBuffer();

        for(int i=0; i<address.length(); i++) {
            if(address.charAt(i) == '.') ans.append(def);
            else ans.append(address.charAt(i));
        }

        return ans.toString();

    }
}
/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */