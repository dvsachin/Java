package geeksforgeeks.School_Level;

import DataStructuresBasic.LinkedList.Node;
import geeksforgeeks.DataStrcutureBasics.LinkedList.InsertINMiddleOfLinkedList;

import java.util.Scanner;

public class CountTypeOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            String s = sc.next();
            int[] res = new CountTypeOfCharacters().count(s);

            for (int i=0; i<4;i++) {
                System.out.println(res[i]);
            }
        }
    }
    int[] count (String s) {
        // your code here
        int countUpperCase = 0, countLowerCase = 0, countNumbers =0, countSpecialChar=0;

        for (int i=0; i<s.length();i++) {
            char current = s.charAt(i);

            if(current >= 'a' && current <= 'z' )  countLowerCase++;
            else  if(current >= 'A' && current <= 'Z' ) countUpperCase++;
            else  if(current >= '0' && current <= '9' ) countNumbers++;
            else countSpecialChar++;
        }

        return new int[] {countUpperCase, countLowerCase, countNumbers, countSpecialChar};
    }
}

/*
Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
Note: There are no white spaces in the string.

Example 1:

Input:
S = "#GeeKs01fOr@gEEks07"
Output:
5
8
4
2
Explanation: There are 5 uppercase characters,
8 lowercase characters, 4 numeric characters
and 2 special characters.

Example 2:

Input:
S = "*GeEkS4GeEkS*"
Output:
6
4
1
2
Explanation: There are 6 uppercase characters,
4 lowercase characters, 1 numeric characters
and 2 special characters.

Your Task:
You don't need to read input or print anything. Your task is to complete the function count() which takes the string S as input and returns an array of size 4 where arr[0] = number of uppercase characters, arr[1] = number of lowercase characters, arr[2] = number of numeric characters and arr[3] = number of special characters.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
 */