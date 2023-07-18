package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LowerCaseToUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-->0) {
            String s = read.readLine().trim();
            System.out.println(new LowerCaseToUpperCase().to_upper(s));

        }
    }
    String to_upper(String str) {
        // code here
        StringBuffer ans = new StringBuffer();

        for (int i=0; i<str.length(); i++) {
            char current = str.charAt(i);
            if(current >= 'a' && current <= 'z') ans.append((char)(current-32));
        }
        return ans.toString();
    }
}
