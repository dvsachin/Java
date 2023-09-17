package leetCode.Easy;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer  temp1  = new StringBuffer();
        StringBuffer temp2 = new StringBuffer();

        for(int i=0; i<word1.length; i++) {
            temp1.append(word1[i]);
        }
        for(int i=0; i<word2.length; i++) {
            temp2.append(word2[i]);
        }

        if(temp1.toString().equals(temp2.toString())) return true;
        else return false;
    }
}
