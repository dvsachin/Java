package geeksforgeeks.Medium_Level;
// https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

import java.util.HashMap;

public class LongestKUniqueCharactersSubstring {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> freq = new HashMap<>();
        int j = 0, i=0, ans = -1;

        while (j < s.length()) {
            char ch = s.charAt(j);
            // count of chars and its occurrences
            if(freq.containsKey(ch)) freq.put(ch, freq.get(ch)+1);
            else freq.put(ch,1);

            // if unique chars is less than k then keep incrementing the size of window
            if(freq.size() < k) {
                j++;
            }
            // if size of window == k then calculates the string length has unique chars
            else if(freq.size() == k) {
                ans = Math.max(ans, j-i+1);
                j++;
            }

            // if unique characters are more than k than move the window towards right
            else if(freq.size() > k) {
                while (freq.size() > k) {
                    char ich = s.charAt(i);
                    if(freq.containsKey(ich)) freq.put(ich, freq.get(ich)-1);
                    if(freq.get(ich) == 0) freq.remove(ich);
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}

/*
Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

Example 1:

Input:
S = "aabacbebebe", K = 3
Output:
7
Explanation:
"cbebebe" is the longest substring with 3 distinct characters.
Example 2:

Input:
S = "aaaa", K = 2
Output: -1
Explanation:
There's no substring with 2 distinct characters.
Your Task:
You don't need to read input or print anything. Your task is to complete the function longestKSubstr() which takes the string S and an integer K as input and returns the length of the longest substring with exactly K distinct characters. If there is no substring with exactly K distinct characters then return -1.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1 ≤ |S| ≤ 105
1 ≤ K ≤ 26
All characters are lowercase latin characters.


 */