package geeksforgeeks.DataStrcutureBasics.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellSort {
    public static void shellSort(int arr[], int n) {
        // code here
        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i - gap;

                while (j >= gap-1 && arr[j] > key) {
                    arr[j + gap] = arr[j];
                    j = j - gap;
                }
                arr[j + gap] = key;
            }
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);


            new ShellSort().shellSort(arr, n);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

        }
    }
}
/*
Given an array arr[] of size N, use Shell Sort Algorithm to sort arr[] in ascending order.

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
You dont need to read input or print anything. Complete the function shellSort() which takes arr[] and N as input parameters and sorts arr[] in-place.


Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 10^3
 */
