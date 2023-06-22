package geeksforgeeks.DataStrcutureBasics.Searching;

import geeksforgeeks.DataStrcutureBasics.Recursion.CountTotalDigitsInANumber;

import java.util.Scanner;

public class Count1sInBinaryArray {
    public static int countOnes(int arr[], int N){

        // Your code here
        int low = 0, high = N - 1;

        if(arr[N-1] == 1) return N;

        if(N == 1)
            if(arr[0] == 1)
                return 1;
            else
                return 0;


        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == 1 && arr[mid+1] == 0 )
                return mid+1;

            else if(arr[mid] == 0)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
                arr[i] = sc.nextInt();

            System.out.println(new Count1sInBinaryArray().countOnes(arr,n));
        }
    }
}

/*
Given a binary sorted non-increasing array of 1s and 0s. You need to print the count of 1s in the binary array.

Example 1:

Input:
N = 8
arr[] = {1,1,1,1,1,0,0,0}
Output: 5
Explanation: Number of 1's in given
binary array : 1 1 1 1 1 0 0 0 is 5.
Example 2:

Input:
N = 8
arr[] = {1,1,0,0,0,0,0,0}
Output: 2
Explanation: Number of 1's in given
binary array : 1 1 0 0 0 0 0 0 is 2.
Your Task:
The task is to complete the function countOne() which takes the array arr[] and its size N as inputs and returns the count of 1s in the input array.

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(1).

Constraint:
1 <= N <= 5*106
arr[i] = 0,1
 */