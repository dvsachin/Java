package geeksforgeeks;

import java.util.Scanner;

public class FindPattern {
    public static int findPattern(String s, String p){
        // code here
        int startIndex = -1;
        // look for first character
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == p.charAt(0)) {
                startIndex = i;
                break;
            }
        }

       if(startIndex == -1 || !(s.substring(startIndex).length() >= p.length())) return -1; // if not Start index is not found or found at insufficient position

        // found the rest of it
        for(int i=startIndex, j=0; i<s.length() && j<p.length(); i++,j++) {
            if(s.charAt(i) != p.charAt(j)) return -1;
        }

        return startIndex;


//        return s.indexOf(p);
//        if(s.contains(p)) return s.indexOf(p);
//        else return -1;




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pattern = sc.nextLine();


        System.out.println(findPattern(str, pattern));
    }
}
/*
Given a string s, and a pattern p. You need to find if p exists in s or not and return the starting index of p in s. If p does not exist in s then -1 will be returned.
Here p and s both are case-sensitive.


Example 1:

Input:
s = "Hello"
p = "llo"
Output:
2
Explanation: llo starts from the second
index in Hello.
Example 2:

Input:
s = "World"
p = "Doodle"
Output:
-1
Explanation: Both are different.
Your Task:
Your task is to complete the function findPattern()  which takes two string s and p as parameter and returns an integer.
 */
