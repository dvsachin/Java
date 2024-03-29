package leetCode.Easy.String;
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckiITheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];

        for(int i=0; i<sentence.length(); i++) {
            count[sentence.charAt(i) - 97] = 1;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] == 0) return false;
        }
        return true;

    }
}

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */