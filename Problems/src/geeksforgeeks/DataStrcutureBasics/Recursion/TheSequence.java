package geeksforgeeks.DataStrcutureBasics.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheSequence {
    public static int theSequence(int N)  {
        // your code here
        if (N == 0) return 1;

        return N + N * theSequence(N-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            System.out.println(new TheSequence().theSequence(n));
        }
    }
}

/*
You are given a number n. You need to recursively find the nth term of the series S that is given by:
S(n) = n+ n*(S(n-1)) and S(0) = 1

Example 1:

Input:
n = 2
Output: 6
Example 2:

Input:
n = 3
Output: 21
Your Task:

Complete the function theSequence that takes n as paramenter and return the answer.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraints:
1 <= n <= 10
 */