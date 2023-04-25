package geeksforgeeks;

import java.util.Scanner;

public class StringPatternMatcher {
    static void follPatt(String s)
    {

        //Your code here
        int count = 0;
        boolean flag = false;

        if(s.length() == 1) {
            System.out.println(0);
            return;
        }

        if(s.length() == 2 && s.equals("xy")) {
            System.out.println(1);
            return;
        }

        for(int i = 0; i < s.length(); i++) {


            if((count != 0 && i!=0 && s.charAt(i-1) == 'y' && s.charAt(i) == 'x'))  {
                flag = true;
                break;
            }

            if(s.charAt(i) == 'x') count++;
            else if(s.charAt(i) == 'y') count--;

        }

        if(flag || count != 0)
            System.out.println(0);
        else
            System.out.println(1);


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        follPatt(str);
    }

}
/*
You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

Example 1:

Input:
xxyy

Output:
1
Example 2:

Input:
xyx

Output:
0
Your Task:

Since this is a function problem, you don't need to take any input. Just complete the function follPatt(string s) that outputs 1 if string is valid, else it outputs 0.

Constraints:
1 <= |s| <=100


 */