package geeksforgeeks.Basic_Level;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UncommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- >0) {
            String A = sc.next();
            String B = sc.next();

            System.out.println(new UncommonCharacters().UncommonChars(A,B));
        }
    }
    String UncommonChars(String A, String B) {
        // code here
        String ans = "";
        for (int i=0; i<A.length(); i++) {
            if(B.contains(A.charAt(i)+"") || ans.contains(A.charAt(i)+""))
                continue;
            ans+=(A.charAt(i));
        }

        for (int i=0; i<B.length(); i++) {
            if(A.contains(B.charAt(i)+"") || ans.contains(B.charAt(i)+""))
                continue;
            ans+=(B.charAt(i));
        }
        if(ans == "") return "-1";
        char[] temp = ans.toCharArray();
        Arrays.sort(temp);
        ans = new String(temp);

        return ans;

    }

}

/*
Given two strings A and B. Find the characters that are not common in the two strings.

Note :- Return the string in sorted order.

Example 1:

Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation:
The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
are either present in A or B, but not in both.
Example 2:

Input:
A = characters
B = alphabets
Output: bclpr
Explanation: The characters 'b','c','l','p','r'
are either present in A or B, but not in both.

Your Task:
You dont need to read input or print anything. Complete the function UncommonChars() which takes strings A and B as input parameters and returns a string that contains all the uncommon characters in sorted order. If no such character exists return "-1".


Expected Time Complexity: O(M+N) where M and N are the sizes of A and B respectively.
Expected Auxiliary Space: O(M+N)


Constraints:
1<= M,N <= 104
String may contain duplicate characters.


 */