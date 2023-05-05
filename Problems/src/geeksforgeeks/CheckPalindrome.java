package geeksforgeeks;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalin(String s){
        // code here
        String reverse = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reverse = reverse+s.charAt(i);
        }

        if(reverse.equalsIgnoreCase(s)) return true;
        else return false;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalin(str));
    }
}

/*
Given a string s, you need to check if it is palindrome or not. A palidrome is a string that reads the same from front and back.
Ignore the case in this question.

Example 1:

Input:
s = "Hello"
Output:
false
Explanation: Hello is not equal to olleH
so it's not a palindrome.
Example 2:

Input:
s = "TenEt"
Output:
true
Explanation: TenEt = tEneT as we are
ignoring the case.
Your Task:
Your task is to complete the function isPalin() which takes a String s as parameter and returns true if it is a palindrome, else return false. The driver code will print the output.
 */