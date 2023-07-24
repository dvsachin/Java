package geeksforgeeks.School_Level;

import DataStructuresBasic.LinkedList.Node;
import geeksforgeeks.Easy_Level.GivenLinkedListOf0s1sAnd2sAndSortIt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PatternOfStrings {
    ArrayList<String> pattern(String S) {
        // code here

        /*
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=S.length(); i>=0; i--) {
            ans.add(S.substring(0,i));
        }
        return ans;

         */

        ArrayList<String> ans = new ArrayList<String>();
        StringBuffer sb;
        for (int i=0; i<S.length(); i++) {
            sb = new StringBuffer();
            for (int j=0; j<S.length()-i; j++) {
                sb.append(S.charAt(j));
            }
            ans.add(sb.toString());
        }
        return ans;
    }
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-->0) {
            String s= reader.readLine();
            ArrayList<String> result = new PatternOfStrings().pattern(s);
            for (String x : result) System.out.println(x);
        }
    }
}
