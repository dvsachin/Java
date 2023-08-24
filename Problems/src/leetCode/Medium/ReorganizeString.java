package leetCode.Medium;

public class ReorganizeString {
    public String reorganizeString(String s) {

        // get frequency of each char in string
        int[] freq = new int[26];
        for (int i=0; i< s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // get majority element letter and its frequency value
        int letter  = 0, frequency = 0;
        for(int i=0;i<freq.length; i++) {
            if(freq[i] > frequency) {
                frequency = freq[i];
                letter = i;
            }
        }

        if(frequency > (s.length() + 1)/2) return "";
        char[] ans = new char[s.length()];

        // fill all even places with majority element
        int index = 0;
        while(freq[letter]-- > 0) {
            ans[index] = (char) (letter + 'a');
            index+=2;
        }

        // fill the reamining letters
        for(int i=0;i<freq.length; i++) {
            while(freq[i]-- > 0) {
                if(index >= ans.length) index = 1;
                ans[index] = (char) (i + 'a');
                index+=2;
            }
        }

        return String.valueOf(ans);

    }
}
/*
https://leetcode.com/problems/reorganize-string/


Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.



Example 1:

Input: s = "aab"
Output: "aba"
Example 2:

Input: s = "aaab"
Output: ""

 */
