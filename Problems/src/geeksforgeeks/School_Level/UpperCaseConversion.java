package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-->0) {
            String s = read.readLine();
            System.out.println(new UpperCaseConversion().transform(s));


        }
    }
    public String transform(String s)  {
        // code here
        StringBuffer ans = new StringBuffer(s.length());
        ans.append((char)(s.charAt(0)-32));

        for (int i=1; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && !Character.isLetter(s.charAt(i - 1)))
                ans.append((char) (s.charAt(i) - 32));
            else
                ans.append(s.charAt(i));
        }

        return ans.toString();

    }
}
/*
Given a string str, convert the first letter of each word in the string to uppercase.

Example 1:

Input:
str = "i love programming"
Output: "I Love Programming"
Explanation:
'I', 'L', 'P' are the first letters of
the three words.

Your Task:
You dont need to read input or print anything. Complete the function transform() which takes s as input parameter and returns the transformed string.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N) to store resultant string


Constraints:
1 <= N <= 104
The original string str only consists of lowercase alphabets and spaces to separate words.


 */