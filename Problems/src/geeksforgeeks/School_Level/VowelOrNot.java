package geeksforgeeks.School_Level;
// https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1
public class VowelOrNot {
    String isVowel(char c){
        // code here
        return switch (c) {
            case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> "YES";
            default -> "NO";
        };
    }
}
/*
Given a English alphabet c, Write a program to check whether a character is a vowel or not.



Example 1:

Input:
c = 'a'
Output:
YES
Explanation:
'a' is a vowel.


Example 2:

Input:
c = 'Z'
Output:
NO
Explanation:
'Z' is not a vowel.

 */