package geeksforgeeks.DataStrcutureBasics.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            System.out.println(new FactorialUsingRecursion().factorial(n));
        }
    }
    static int factorial(int N) {
        // find and return the factorial of N
        if( N  == 1) return N;

        return N * factorial(N-1);
    }
}
