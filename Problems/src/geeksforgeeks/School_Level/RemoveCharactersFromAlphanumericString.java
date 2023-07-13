package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCharactersFromAlphanumericString {
    String removeCharacters(String S) {
        // code here
        if(S == null) return S;

        StringBuffer sb = new StringBuffer(S.length());
        for (int i=0; i<S.length(); i++) {
            int value = S.charAt(i)-'0';
            if( value >= 0 && value <= 9) sb.append(S.charAt(i));
        }
        return sb.toString();

    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine();
            System.out.println(new RemoveCharactersFromAlphanumericString().removeCharacters(s));
        }
    }

}
/*
Remove all characters except the numeric characters from an alphanumeric string.

Example 1:

Input: S = "AA1d23cBB4"
Output: 1234
Explanation: Remove all characters
other than numbers
Example 2:

Input: S = "a1b2c3"
Output: 123
Explanation: Remove all characters
other than numbers
Your task:
Your task is to complete the function string() which takes a single string as input and returns the string. You need not take any input or print anything.


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

Constraints:
1 <= |S| <= 105
 */