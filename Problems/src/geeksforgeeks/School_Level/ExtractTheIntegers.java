package geeksforgeeks.School_Level;

import geeksforgeeks.Medium_Level.LongestRepeatingSubsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExtractTheIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-->0) {
            String s = read.readLine();
            ArrayList<String> ans = new ExtractTheIntegers().extractIntegerWords(s);
            if(ans.size() == 0) System.out.println("No Integers");
            else {
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
    ArrayList<String> extractIntegerWords(String s)  {
        // code here
        ArrayList<String> result = new ArrayList<>();
        StringBuffer temp = new StringBuffer();

        for (int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if(current >= '0' && current <= '9')
                temp.append(current);
            else {
                if (temp.length() > 0) {
                    result.add(temp + "");
                    temp = new StringBuffer();
                }
            }
        }
        if (temp.length() > 0)  result.add(temp + "");

        return result;
    }

}
/*
Given a string s, extract all the integers from s.

Example 1:

Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
     3: Rishabh Gupta56"
Output: 1 2 3 56
Explanation:
1, 2, 3, 56 are the integers present in s.
Example 2:

Input:
s = "geeksforgeeks"
Output: No Integers
Explanation:
No integers present in the string.


Your Task:
You don't need to read input or print anything. Complete the function extractIntegerWords() which takes string s as input and returns a list of integers. If an empty list is returned the output is printed as "No Integers".



Expected Time Complexity: O(|s|).
Expected Auxiliary Space: O(|s|).



Constraints:
1<=|s|<=105


 */
