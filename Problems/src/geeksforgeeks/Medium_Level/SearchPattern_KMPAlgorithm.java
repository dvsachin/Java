package geeksforgeeks.Medium_Level;

import java.util.ArrayList;
// https://www.geeksforgeeks.org/problems/search-pattern0205/1
public class SearchPattern_KMPAlgorithm {
    public void getLSP(String pat, int[] lsp) {
        int sz = 0, i = 1;
        lsp[0] = 0;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(sz)) {
                lsp[i++] = ++sz;
            } else if (sz == 0) {
                lsp[i++] = 0;
            } else {
                sz = lsp[sz - 1];
            }
        }
    }

    public ArrayList<Integer> search(String pat, String txt) {
        int n = pat.length(), m = txt.length();
        int[] ls = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();

        getLSP(pat, ls);

        int i = 0, j = 0;
        while (i < m) {
            if (txt.charAt(i) == pat.charAt(j)) {
                ++i;
                ++j;
            }
            if (j == n) {
                ans.add(i - j + 1);
                j = ls[j - 1];
            } else if (i < m && txt.charAt(i) != pat.charAt(j)) {
                if (j == 0) {
                    i++;
                } else {
                    j = ls[j - 1];
                }
            }
        }
        return ans;
    }

}

/*
Given two strings, one is a text string, txt and other is a pattern string, pat. The task is to print the indexes of all the occurences of pattern string in the text string. Use one-based indexing while returing the indices.
Note: Return an empty list incase of no occurences of pattern. Driver will print -1 in this case.

Example 1:

Input:
txt = "geeksforgeeks"
pat = "geek"
Output:
1 9
Explanation:
The string "geek" occurs twice in txt, one starts are index 1 and the other at index 9.
Example 2:

Input:
txt = "abesdu"
pat = "edu"
Output:
-1
Explanation:
There's not substring "edu" present in txt.
Your Task:
You don't need to read input or print anything. Your task is to complete the function search() which takes the string txt and the string pat as inputs and returns an array denoting the start indices (1-based) of substring pat in the string txt.

Expected Time Complexity: O(|txt|).
Expected Auxiliary Space: O(|txt|).

Constraints:
1 ≤ |txt| ≤ 105
1 ≤ |pat| < |S|
Both the strings consists of lowercase English alphabets.
 */