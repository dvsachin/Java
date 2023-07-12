package geeksforgeeks.School_Level;

import geeksforgeeks.Medium_Level.FindKthElementOfSpiralMatrix;

import java.util.Scanner;

public class JavaSubstring {
    static String javaSub(String S, int L, int R) {
        // code here
        StringBuffer sb = new StringBuffer(S.length());

        if (L >= 0 && R <= S.length()) {
            for (int i = L; i <= R; i++)
                sb.append(S.charAt(i));

            return String.valueOf(sb);
        } else return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            String n  = scanner.next();
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            System.out.println(new JavaSubstring().javaSub(n,L,R));
        }
    }
}
/*
Given a string S and two integers L and R. Print the characters in the range L to R of the string.
NOTE: Assume zero based indexing.

Example 1:

Input:
S = "cdbkdub"
L = 0 , R = 5
Output: "cdbkdu"
Explanation: Starting from index 0 ('c')
to index 5 ('u').
Example 2:

Input:
S = "sdiblcsdbud"
L = 3 , R = 7
Output: "blcsd"
Explanation: Starting from index 3 ('b')
to index 7 ('d').

Your Task:
You dont need to read input or print anything. Complete the function javaSub() which takes S, L, R as input parameter and returns the sting from the range L to R.


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1<= |S| <=1000
1 <= L <= 800
1 <= R <= 900
 */
