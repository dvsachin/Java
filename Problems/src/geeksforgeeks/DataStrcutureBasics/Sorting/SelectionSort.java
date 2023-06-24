package geeksforgeeks.DataStrcutureBasics.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n;i++)
                arr[i] = sc.nextInt();

            new SelectionSort().selectionSort(arr,n);

        }

    }
    int  select(int arr[], int i)  {
        // code here such that selectionSort() sorts arr[]
        int x = i;
        for(int j=i-1; j>=0; j--) {
            if(arr[j] > arr[x]) x=j;
        }
        return x;
    }

    void selectionSort(int arr[], int n)	{
        //code here
        int temp = 0;
        for(int i = n-1; i >=0; i--) {
            int j = select(arr, i);

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int x : arr)
            System.out.print(x+" ");
        System.out.println();
    }

}
/*
Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.


Example 1:

Input:
N = 5
arr[] = {4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Explanation:
Maintain sorted (in bold) and unsorted subarrays.
Select 1. Array becomes 1 4 3 9 7.
Select 3. Array becomes 1 3 4 9 7.
Select 4. Array becomes 1 3 4 9 7.
Select 7. Array becomes 1 3 4 7 9.
Select 9. Array becomes 1 3 4 7 9.
Example 2:

Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10

Your Task:
You dont need to read input or print anything. Complete the functions select() and selectionSort() ,where select() takes arr[] and starting point of unsorted array i as input parameters and returns the selected element for each iteration in selection sort, and selectionSort() takes the array and it's size and sorts the array.


Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 10^3
 */