package geeksforgeeks.School_Level;

import geeksforgeeks.Basic_Level.FirstComeFirstServe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneComplement {
    static String onesComplement(String S,int N){
        //code here
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<N; i++) {
            if(S.charAt(i) - '0' == 0) sb.append(1);
            else sb.append(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String s = reader.readLine();
            System.out.println(new OneComplement().onesComplement(s,n));
        }
    }
}
