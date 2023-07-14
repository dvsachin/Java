package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RemoveVowelsFromString {
    String removeVowels(String S) {
        // code here
        StringBuffer ans = new StringBuffer(S.length());

        for (int i=0; i<S.length(); i++) {
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' ||S.charAt(i) == 'i' ||
                    S.charAt(i) == 'o' || S.charAt(i) == 'u' ) continue;
            ans.append(S.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(read.readLine());

        while (t-->0) {
            String s = read.readLine();
            System.out.println(new RemoveVowelsFromString().removeVowels(s));
        }

    }
}
