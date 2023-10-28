package geeksforgeeks.Medium_Level;
// https://practice.geeksforgeeks.org/problems/minimum-deletitions1648/1
public class MinimumDeletions {
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n = S.length();
        int[][] arr = new int[n+1][n+1];
        StringBuilder s = new StringBuilder(S);
        s.reverse();

        for(int i=n; i>=0; i--){
            for(int j=n; j>=0; j--){
                if(i==n || j==n) arr[i][j] = 0;
                else if(S.charAt(i)==s.charAt(j)) arr[i][j] = 1+arr[i+1][j+1];
                else arr[i][j] = Math.max(arr[i][j+1],arr[i+1][j]);
            }
        }

        return n-arr[0][0];
    }
}
/*
Given a string of S as input. Your task is to write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome.
Note: The order of characters in the string should be maintained.

Example 1:

Input:
S = "aebcbda"
Output:
2
Explanation:
Remove characters 'e' and 'd'.
Example 2:

Input:
S = "geeksforgeeks"
Output:
8
Explanation:
One of the possible result string can be "eefee", so answer is 13 - 5 = 8.
Your Task:
You don't need to read input or print anything. Your task is to complete the function minimumNumberOfDeletions() which takes the string S as inputs and returns the minimum number of deletions required to convert S into a pallindrome.

Expected Time Complexity: O(|S|2)
Expected Auxiliary Space: O(|S|2)

Constraints:
1 ≤ |S| ≤ 103


 */