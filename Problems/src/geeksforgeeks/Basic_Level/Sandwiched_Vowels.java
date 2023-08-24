package geeksforgeeks.Basic_Level;

public class Sandwiched_Vowels {
    public static String Sandwiched_Vowel(String str) {
        // Complete function
        StringBuffer ans = new StringBuffer();
        char prev = 0, curr = 0, nxt = 0;

        if(str.length() < 3) return str;

        ans.append(str.charAt(0));


        for(int i=1; i<str.length()-1; i++) {
            prev = str.charAt(i-1);
            curr = str.charAt(i);
            nxt = str.charAt(i+1);

            if(checkVowel(curr) &&
                    !checkVowel(prev) &&
                    !checkVowel(nxt)) continue;

            else
                ans.append(curr);

        }

        ans.append(str.charAt(str.length()-1));

        return ans.toString();

    }
    private static boolean checkVowel(char ch) {
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default: return false;
        }
    }
}
/*
https://practice.geeksforgeeks.org/problems/sandwiched-vowels5158/1

For a given string S, comprising of only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants(sandwiched between two immediately adjacent consonants). Print the updated string on a new line.

Example 1:

Input : S = "bab"
Output : bb
Explanation:
a is a vowel occuring between two consonants i.e. b.
Hence the updated string eliminates a.

Example 2:

Input : S = "ceghij"
Output : cghj


Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function Sandwiched_Vowel() that takes a String (s), and return the updated String. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


 */
