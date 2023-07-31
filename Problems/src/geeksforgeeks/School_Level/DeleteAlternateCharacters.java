package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteAlternateCharacters {
    public static void main(String[] args)  throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-->0) {
            String S = read.readLine();
            System.out.println(new DeleteAlternateCharacters().delAlternate(S));
        }
    }
    static String delAlternate(String S) {
        // code here
        StringBuffer ans = new StringBuffer();

        for(int i=0; i<S.length(); i++) {
            ans.append(S.charAt(i));
            i++;
        }
        return ans.toString();
    }

}
/*
Given a string S as input. Delete the characters at odd indices of the string.

Example 1:

Input: S = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1
and "k" at index 3.
Example 2:

Input: S = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e
k at index 1, 3, 5, 7, 9, 11.

Your Task:
You dont need to read input or print anything. Complete the function delAlternate() which takes S as input parameter and returns the final string after deletion of characters at odd indices.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1<= |S| <=1000
 */