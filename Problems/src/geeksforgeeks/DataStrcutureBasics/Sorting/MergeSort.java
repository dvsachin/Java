package geeksforgeeks.DataStrcutureBasics.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n;i++)
                arr[i] = sc.nextInt();

            new MergeSort().mergeSort(arr,0,arr.length-1);

            for (int i=0; i<arr.length; i++)
                System.out.print(arr[i]+" ");
        }

    }

    void merge(int arr[], int l, int m, int r) {
        // Your code here
        int n1 = m-l+1;
        int n2 = r-m;
        int i=0,j=0,k=l;

        int[] left = new int[n1];
        int[] right = new  int[n2];

        for (int p=0; p<n1;p++) {
            left[p] = arr[l+p];
        }
        for (int q=0; q<n2;q++) {
            right[q] = arr[m+q+1];
        }

        while (i<n1 && j<n2 ) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            }
            else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i<n1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j<n2) {
            arr[k] = right[j];
            k++;
            j++;
        }


    }
    void mergeSort(int arr[], int l, int r) {
        //code here
        if(r > l) {
            int m = l + (r-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }

}
/*
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10

Your Task:
You don't need to take the input or print anything. Your task is to complete the function merge() which takes arr[], l, m, r as its input parameters and modifies arr[] in-place such that it is sorted from position l to position r, and function mergeSort() which uses merge() to sort the array in ascending order using merge sort algorithm.

Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(n)

Constraints:
1 <= N <= 105
1 <= arr[i] <= 105
 */