package geeksforgeeks.School_Level;

import DataStructuresBasic.LinkedList.Node;
import geeksforgeeks.Basic_Level.PrintLinkedListElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while ( t-- >0) {
            String s = sc.nextLine();
            List<String> ans  = new SplitStrings().splitString(s);
            for (String val: ans)
                if(val == "") System.out.println(-1);
            else System.out.println(val);
        }
    }
    static List<String> splitString(String S) {
        // code here
        List<String> ans = new ArrayList<>();
        String s1alpha = "";
        String s1Num = "";
        String s1Sp = "";

        for (int i=0; i<S.length(); i++) {
            char current =  S.charAt(i);

            if(Character.isLetter(current)) s1alpha+=current;
            else if(Character.isDigit(current)) s1Num+=current;
            else s1Sp+=current;
        }

        ans.add(s1alpha); ans.add(s1Num); ans.add(s1Sp);

        return ans;
    }
}
/*
Given a string S which consists of alphabets , numbers and special characters. You need to write a program to split the strings in three different strings S1, S2 and S3 such that the string S1 will contain all the alphabets present in S , the string S2 will contain all the numbers present in S and S3 will contain all special characters present in S.  The strings S1, S2 and S3 should have characters in same order as they appear in input.


Example 1:

Input:
S = geeks01for02geeks03!!!
Output:
geeksforgeeks
010203
!!!
Explanation: The output shows S1, S2 and S3.
Example 2:

Input:
S = **Docoding123456789everyday##
Output:
Docodingeveryday
123456789
**##

Your Task:
You dont need to read input or print anything. Complete the function splitString() which takes the string S as input parameters and returns a list of strings containing S1, S2 and S3 respectively. If you return an empty string the driver will print -1.



Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(N)
 */