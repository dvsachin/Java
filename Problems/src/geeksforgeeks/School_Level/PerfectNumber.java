package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            System.out.println(new PerfectNumber().isPerfect(n));
        }
    }
    int isPerfect(int N) {
        // code here
        int curr = 0, sum = 0, temp = N;

        while (temp > 0) {
            curr = temp%10;
            sum = sum + getFactorial(curr);
            temp = temp/10;
        }

        return (N == sum)? 1:0;


    }
    int getFactorial(int N) {
        int fact = 1;

        for(int i=1;i<=N; i++)  {
            fact = fact * i;
        }
        return fact;
    }
}
