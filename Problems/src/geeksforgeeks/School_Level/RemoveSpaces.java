package geeksforgeeks.School_Level;

import DataStructuresBasic.LinkedList.Node;
import geeksforgeeks.Medium_Level.ReverseLinkedListInGroupsOfGivenSize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveSpaces {
    String modify(String S) {
        // your code here
        StringBuffer ans = new StringBuffer(S.trim().length());

        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == ' ') continue;
            ans.append(S.charAt(i));
        }

        return ans.toString();

    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-->0) {
            String s = read.readLine();
            System.out.println(new RemoveSpaces().modify(s));


        }
    }
}
/*
Given a string, remove spaces from it.

Example 1:

Input:
S = "geeks  for geeks"
Output: geeksforgeeks
Explanation: All the spaces have been
removed.
Example 2:

Input:
S = "    g f g"
Output: gfg
Explanation: All the spaces including
the leading ones have been removed.

Your Task:
You don't need to read input or print anything. Your task is to complete the function modify() which takes the string S as input and returns the resultant string by removing all the white spaces from S.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
 */