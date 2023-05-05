package geeksforgeeks;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s){
        // code here
        String reverse = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reverse = reverse+s.charAt(i);
        }

        return reverse;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverseString(str));
    }
}

/*
Given a string s, you need to reverse it.

Example 1:

Input:
s = "Hello"
Output:
olleH
Explanation: Reverse of Hello is olleH
Example 2:

Input:
s = "World"
Output:
dlroW
Explanation: Reverse of World is dlroW
Your Task:
The task is to complete the reverseString() which takes a string s as parameter and returns the reversed string.
 */