package DataStructuresBasic.Recursion;

import java.util.Scanner;

public class PalindromeCheckUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.next();

        System.out.println(isPalindrome(s,0, s.length()-1));

    }

    static boolean isPalindrome(String str, int start, int end) {
        if(start >= end) // even length n=0 or odd length = 1
            return true;

        return ((str.charAt(start)==str.charAt(end)) &&
                isPalindrome(str, start + 1, end - 1));
    }
}
// abbcbba => Yes

// abb => Yes

// accka => Np

// T.C = O(n)
// S.C = O(n)
