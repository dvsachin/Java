package geeksforgeeks.School_Level;

import java.util.Scanner;

public class CountOfCamelCaseCharacters {
    int countCamelCase (String s) {
        // your code here
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <=90) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            System.out.println(new CountOfCamelCaseCharacters().countCamelCase(s));
        }
    }
}
/*
Given a string. Count the number of Camel Case characters in it.

Example 1:

Input:
S = "ckjkUUYII"
Output: 5
Explanation: Camel Case characters present:
U, U, Y, I and I.

â€‹Example 2:

Input:
S = "abcd"
Output: 0
Explanation: No Camel Case character
present.

Your Task:
You don't need to read input or print anything. Your task is to complete the function countCamelCase() which takes the string S as input and returns the count of the camel case characters in the string.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
 */
