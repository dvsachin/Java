package geeksforgeeks.School_Level;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReversingTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            String s = sc.next();
            System.out.println(new ReversingTheVowels().modify(s));
        }
    }

    private static boolean checkVowel(char input) {
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            return true;
        } else return false;
    }

    String modify (String s) {
        // your code here
        int i=0, j=s.length()-1;
        char[]  inputArray = s.toCharArray();

        while (i < j) {
            if(!checkVowel(inputArray[i])) {
                i++;
                continue;
            }
            else if(!checkVowel(inputArray[j])) {
                j--;
                continue;
            }
            char temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;

            j--;i++;
        }
        return String.valueOf(inputArray);
    }
}

/* Naive : bruteforce
  String modify (String s) {
        // your code here
        StringBuffer sb = new StringBuffer();
        StringBuffer ans = new StringBuffer();
        int vowelCount = 0;

        for (int i=s.length()-1; i>=0;i--) {
            char current = s.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == '0' || current == 'u') {
                sb.append(current);
                vowelCount++;
            }
        }


        int index = 0;
        for (int i=0; i<s.length() && index < vowelCount;i++) {
            char current = s.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == '0' || current == 'u') {
                ans.append(sb.charAt(index));
                index++;
            }
            else ans.append(s.charAt(i));

        }
        return ans.toString();

    }
 */
/*
Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.

Example 1:

Input:
S = "geeksforgeeks"
Output: geeksforgeeks
Explanation: The vowels are: e, e, o, e, e
Reverse of these is also e, e, o, e, e.

Example 2:

Input:
S = "practice"
Output: prectica
Explanation: The vowels are a, i, e
Reverse of these is e, i, a.


Example 3:

Input:
S = "bcdfg"
Output: bcdfg
Explanation: There are no vowels in S.

Your Task:
You don't need to read input or print anything. Your task is to complete the function modify() which takes the string S as input and returns the resultant string by reversing only the vowels present in S.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).


Constraints:
1<=|S|<=105




 */