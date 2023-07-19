package geeksforgeeks.Easy_Level;

import geeksforgeeks.School_Level.BinaryRepresentation;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();
            char ans = new NonRepeatingCharacter().nonrepeatingCharacter(st);
            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

        }
    }

    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S) {
        //Your code here
        char ans = '$';
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char curr = S.charAt(i);
            if (freq.containsKey(curr)) {
                freq.put(curr, freq.get(curr) + 1);
            } else
                freq.put(curr, 1);
        }

        for (int i = 0; i < S.length(); i++) {
            char curr = S.charAt(i);
            if (freq.get(curr) == 1) {
                ans = curr;
                break;
            }
        }
        return ans;
    }
}
