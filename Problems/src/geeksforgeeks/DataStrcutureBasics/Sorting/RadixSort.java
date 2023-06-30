package geeksforgeeks.DataStrcutureBasics.Sorting;

import geeksforgeeks.School_Level.SecondLargest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RadixSort {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(read.readLine().trim());
            int[] arr = new int[n];
            String[] inputLine = read.readLine().trim().split(" ");

            for (int i =0; i<n; i++)
                arr[i] = Integer.parseInt(inputLine[i]);

            new RadixSort().radixSort(arr,n);

            for (int i =0; i<n; i++)
                System.out.print(arr[i]+" ");

        }
    }
    static void radixSort(int arr[], int n)  {
        // code here
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];

        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, n, exp);
    }

    static void countingSort(int arr[], int n, int exp) {
        int[] output=new int[n];
        int[] count=new int[10];

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
/*
Given an array arr[] of size N, use Radix Sort Algorithm to sort arr[] in ascending order.

Example 1:

Input :
N = 5
arr[] = {1, 9, 345, 2}

Output: 1 2 9 345

Example 2:

Input :
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}

Output: 1 2 3 4 5 6 7 8 9 10

Your Task:
You dont need to read input or print anything. Complete the function radixSort() which takes arr[] and N as input parameters and sorts arr[] in-place.


Expected Time Complexity: O(N * K) where K is the number of bits required to store each key.
Expected Auxiliary Space: O(N + K)


Constraints:
1 ≤ N ≤ 10^3
 */
