package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArray {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());
            String[] s = read.readLine().trim().split(" ");
            long[] arr = new long[(int) N];

            for (int i=0; i<N; i++)
                arr[i] = Long.parseLong(s[i]);

            System.out.println(new SumOfArray().getSum(arr,N));

        }
    }

    public long getSum(long a[], long n) {
        // Your code goes here
        long sum = 0;
        for (int i=0; i<n; i++)
            sum+=a[i];

        return sum;
    }

}
/*
Given an array of N integers. Your task is to print the sum of all of the integers.


Example 1:

Input:
4
1 2 3 4
Output:
10


Example 2:

Input:
6
5 8 3 10 22 45
Output:
93


Your Task:
You don't need to read input or print anything. Your task is to complete the function getSum() which takes the array A[] and its size N as inputs and returns the sum of array in a new line.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 ≤ N ≤ 106
0 ≤ Arr[i] ≤ 200
 */