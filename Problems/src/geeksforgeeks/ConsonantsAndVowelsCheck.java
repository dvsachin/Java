package geeksforgeeks;

import java.util.Scanner;

public class ConsonantsAndVowelsCheck {
    static void checkString(String s) {
        int v = 0;
        int c = 0;

        //Your code here
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') continue;  // System.out.print(s.charAt(i)+"-");
            if(checkVowel(s.charAt(i))) v++;
            else c++;
        }

        if(v > c)
            System.out.print("Yes");
        else if(c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
    public static boolean checkVowel(char c) {
        if( c == 'a' || c == 'e' ||  c == 'i' || c == 'o' ||  c == 'u')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        checkString(s);
    }

}
/*
You are given a string s containing only lowecase letters. You need to count the number of vowels and the number of consonants.

If vowel count > consonant count then print - “Yes”(without quotes).
If vowel count < consonant count then print - “No”(without quotes).
If vowel count = consonant count then print - “Same”(without quotes).
Example 1:

Input:
the quick brown fox jumps over the lazy dog

Output:
No
Example 2:

Input:
aaaaaa

Output:
Yes
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the function checkString(string  s) that take s as input and produces output.

Constraints:
1 <= |s| <= 100
 */