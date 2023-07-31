package geeksforgeeks.Basic_Level;

import java.util.HashMap;
import java.util.Scanner;

public class CountTheCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- >0) {
           String s = sc.next();
           int n = sc.nextInt();
            System.out.println(new CountTheCharacters().getCount(s,n));
        }
    }
    int getCount (String S, int N) {
        // your code here
        HashMap<Character, Integer> freq = new HashMap<>();
        freq.put(S.charAt(0),1);
        int count = 0;
        for (int i=1; i<S.length(); i++) {
            char curr = S.charAt(i);
            if(curr == S.charAt(i-1)) { continue;}
            if(freq.containsKey(curr)) freq.put(curr, freq.get(curr)+1);
            else freq.put(curr,1);
        }
        for (Integer x : freq.values())
            if(x == N) count++;

        return count;
    }
}
/*
Given a string S. Count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.

Example 1:

Input:
S = "abc", N = 1
Output: 3
Explanation: 'a', 'b' and 'c' all have
1 occurrence.

â€‹Example 2:

Input:
S = "geeksforgeeks", N = 2
Output: 4
Explanation: 'g', 'e', 'k' and 's' have
2 occurrences.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getCount() which takes the string S and an integer N as inputs and returns the count of the characters that have exactly N occurrences in the string. Note that the consecutive occurrences of a character have to be counted as 1.


Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).


Constraints:
1<=|S|<=105
1<=N<=103
 */
