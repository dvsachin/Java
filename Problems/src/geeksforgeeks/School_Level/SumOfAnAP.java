package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfAnAP {
    public int sum_of_ap(int n, int a, int d) {
        // Code here
        int temp = (n-1)*d;
        return ( (n* (2*a+temp))/2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String s = reader.readLine();
            String[] S = s.split(" ");
            int n = Integer.parseInt(S[0]);
            int a = Integer.parseInt(S[1]);
            int d = Integer.parseInt(S[2]);
            System.out.println(new SumOfAnAP().sum_of_ap(n,a,d));
        }
    }
}
