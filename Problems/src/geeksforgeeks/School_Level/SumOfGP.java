package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfGP {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String s = reader.readLine();
            String[] S = s.split(" ");
            long n = Long.parseLong(S[0]);
            long a = Long.parseLong(S[1]);
            long r = Long.parseLong(S[2]);
            System.out.println(new SumOfGP().sum_of_gp(n,a,r));
        }
    }
    public long sum_of_gp(long n, long a, long r) {
        // Code here
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a;
            a = a * r;
        }
        System.out.println(Math.floor(sum));
        return (long) sum;
    }

}
/*
Given n, a and r as the number of terms, first term and common ratio respectively of an Geometric Progression Series. Find the sum of the series upto nth term.


Example 1:

Input: 3 3 2
Output: 21
Explanation: Series upto 3td term is
3 6 12, so sum will be 21.

Example 2:

Input: 3 1 2
Output: 7
Example: Series upto 3rd term is
1 2 4, so sum will be 7.


Your Task:
You don't need to read or print anything. Your task is to complete the function sum_of_gp() which takes n, a and r as input parameter and returns the sum of the series.


Expected Time Complexity: O(1)
Expected Space Complexity: O(1)


Constranits:
1 <= n, a, r <= 10
 */