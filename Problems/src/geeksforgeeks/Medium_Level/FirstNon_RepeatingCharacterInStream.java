package geeksforgeeks.Medium_Level;

import geeksforgeeks.Basic_Level.QueueReversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class FirstNon_RepeatingCharacterInStream {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(read.readLine().trim());

        while (t-->0) {
            String s = read.readLine().trim();
            String ans = new FirstNon_RepeatingCharacterInStream().FirstNonRepeating(s);
            System.out.println(ans);
        }
    }

    public String FirstNonRepeating(String A) {
        // code here
        int[] visited = new int[26];
        ArrayList<Character> v  = new ArrayList<>();
        StringBuffer ans = new StringBuffer();

        for (int i=0; i<A.length(); i++) {
            if( (visited[A.charAt(i) - 'a'] == 0)) {
                v.add(A.charAt(i));
            }
            visited[A.charAt(i)-'a']++;

            int f = 0, m = v.size();

            for (int j=0; j<m; j++) {
                if(visited[v.get(j) - 'a'] == 1) {
                    ans.append(v.get(j));
                    f = 1;
                    break;
                }
            }
            if(f == 0) ans.append("#");

        }
        return ans.toString();
    }

}
/*
Given an input stream A of n characters consisting only of lower case alphabets. While reading characters from the stream, you have to tell which character has appeared only once in the stream upto that point. If there are many characters that have appeared only once, you have to tell which one of them was the first one to appear. If there is no such character then append '#' to the answer.


Example 1:

Input: A = "aabc"
Output: "a#bb"
Explanation: For every character first non
repeating character is as follow-
"a" - first non-repeating character is 'a'
"aa" - no non-repeating character so '#'
"aab" - first non-repeating character is 'b'
"aabc" - first non-repeating character is 'b'
Example 2:

Input: A = "zz"
Output: "z#"
Explanation: For every character first non
repeating character is as follow-
"z" - first non-repeating character is 'z'
"zz" - no non-repeating character so '#'


Your Task:
You don't need to read or print anything. Your task is to complete the function FirstNonRepeating() which takes A as input parameter and returns a string after processing the input stream.


Expected Time Complexity: O(26 * n)
Expected Space Complexity: O(26)


Constraints:
1 <= n <= 105
 */