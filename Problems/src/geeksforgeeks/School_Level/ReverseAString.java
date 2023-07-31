package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseAString {
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-->0) {
            String s= reader.readLine();
            System.out.println(new ReverseAString().revStr(s));
        }
    }
    static String revStr(String S) {
        // code here
        StringBuffer ans = new StringBuffer();
        for(int i=S.length()-1; i>=0; i--) {
            ans.append(S.charAt(i));
        }
        return ans.toString();
    }
}

/*
Given a String S , print the reverse of the string as output.

Example 1:

Input: S = "GeeksforGeeks"
Output: "skeeGrofskeeG"
Explanation: Element at first is at last and
last is at first, second is at second last and
second last is at second position and so on .
Example 2:

Input: S = "ReversE"
Output: "EsreveR"
Explanation: "E" at first and "R" at last and
"e" at second last and "s" at second and
so on .

Your Task:
You dont need to read input or print anything. Complete the function revStr() which takes S as input parameter and returns the reversed string .

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1<= |S| <=1000
 */