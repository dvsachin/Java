package DataStructuresBasic.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDEuclid {
    // Complete the function
    // a: first number
    // b: second number
    public static int GCD(int a, int b) {
        // find and return GCD of two numbers;
        if(b !=0)
            return GCD(b, a % b);
        else
            return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            System.out.println(new GCDEuclid().GCD(a,b));
        }
    }
}

/*
You are given a two numbers a and b. Find their GCD using recursion.

Example 1:

Input:
a = 7, b = 8
Output: 1
Example 2:

Input:
a = 2, b = 4
Output: 2
Your Task:

Complete the function GCD that takes a and b as parameters and returns the GCD.

Expected Time Complexity: O(Log(N)).
Expected Auxiliary Space: O(Log(N)) (Recursive).

Constraints:
1 <= a, b <= 100
 */