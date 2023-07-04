package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintElementsOfArray {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] s = read.readLine().trim().split(" ");
            int[] arr = new int[N];

            for (int i=0; i<N; i++)
                arr[i] = Integer.parseInt(s[i]);

            new PrintElementsOfArray().printArray(arr,N);

        }
    }

    void printArray(int arr[], int n) {
        //   code here
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

/*
Given an array Arr of size N, print all its elements.

Example 1:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 1 2 3 4 5
Example 2:

Input:
N = 4
Arr[] = {2, 3, 5, 5}
Output: 2 3 5 5
Your Task:
Complete the function printArray() which takes an array arr, single integer n, as input parameters and prints the value of the array space separated.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 105
1 <= Arr[i] <= 105
 */