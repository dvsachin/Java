package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDeleteAndShift {
    public static void deleteFromArray(int arr[], int n, int index) {
        // Your code here
        for(int i = index; i<n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = 0;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            int index = Integer.parseInt(read.readLine());

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            new ArrayDeleteAndShift().deleteFromArray(arr,n,index);
            for (int i=0; i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println();


        }
    }
}
/*
You are given an array arr(0-based indexing). The size of the array is given by n. You need to delete an element at given index and print the modified array. The arr[i] of array is initially set to i+1.
Deletion means you need to shift all the elements after that index to the left by 1 position and set the last element as zero.

Example 1:

Input:
n = 5
index = 0
Output: 2 3 4 5 0
Example 2:

Input:
n = 6
index = 3
Output: 1 2 3 5 6 0
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function deleteFromArray() that takes arr, n, index as parameters and modifies the array arr as per requirements.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n<= 10^3
0 <= index <= n-1
 */
