package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseLongDigits {
    public long reverse_digit(long n) {
        // Code here
        StringBuffer ans = new StringBuffer(Long.toString(n));
        return Long.valueOf(ans.reverse().toString());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            long n = Long.parseLong(reader.readLine().trim());
            System.out.println(new ReverseLongDigits().reverse_digit(n));
        }

    }
}
