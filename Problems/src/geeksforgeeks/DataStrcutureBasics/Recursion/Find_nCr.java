package geeksforgeeks.DataStrcutureBasics.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_nCr {
    public static int nCr(int n,int r)  {
        // your code here
        if (n < r) return 0; // division becomes negative or zero
        if( n == 1 || r == 0) return 1;  // num/deno is 1!
        if(r == 1) return n;  // n!/(n-r)! * r! = n when r is 1

        return nCr(n-1,r-1) + nCr(n-1,r);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String[] str = read.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            System.out.println(new Find_nCr().nCr(n,r));
        }
    }
}

/*
You are given two numbers n and r. You need to find nCr.
nCr = (n!) / ((n-r)!*(r!))
In recursive way, we can write nCr as nCr = (n-1)C(r-1) + (n-1)Cr

Example 1:

Input:
n = 5, r = 2
Output: 10
Example 2:

Input:
n = 4, r = 1
Output: 4
Your Task:
You only need to complete the function nCr that takes n and r as parameters and returns the nCr.

Expected Time Complexity: O(2N).
Expected Auxiliary Space: O(2N) (Recursive).

Constraints:
1 <= r <= n <= 30
 */