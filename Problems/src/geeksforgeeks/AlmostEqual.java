package geeksforgeeks;

import java.util.Scanner;

public class AlmostEqual {
    static int coutChars(String s1, String s2)
    {

        //Your code here
        int[] charCount = new int[26];
        int count = 0;

        for(int i = 0; i < s1.length(); i++) {
            charCount[(s1.charAt(i))-97]++;
        }
        for(int i = 0; i < s2.length(); i++) {
            charCount[(s2.charAt(i))-97]--;
        }
        for(int i = 0; i < charCount.length; i++) {
            count = count + Math.abs(charCount[i]);
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
        String str1 = "cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu";
        String str2 = "dniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs";
        System.out.println(coutChars(str1,str2));

    }
}

/*
Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.

Example 1:

Input:
madame
madam

Output:
1

Explanation:
String S1 = madame, string S2 = madam. character 'e' in
first string is need to be deleted to make S1 equal to S2.
Example 2:

Input:
suryansh
suryanshzzawesome

Output:
9

Explanation:
String S1 = suryansh, string S2 = suryanshzzawesome.
All character after "suryansh" in second string are
need to be deleted to make S1 equal to S2.
Constraints:
1 <= S1, S2 <= 104
 */