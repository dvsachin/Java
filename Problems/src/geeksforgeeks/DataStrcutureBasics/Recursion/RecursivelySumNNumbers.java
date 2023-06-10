package geeksforgeeks.DataStrcutureBasics.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursivelySumNNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            System.out.println(new RecursivelySumNNumbers().recursiveSum(n));
        }
    }
    public static int recursiveSum(int N) {
        // recursively sum from 1 to N
        if(N == 0) return 0;

        return N + recursiveSum(N-1);
    }
}
