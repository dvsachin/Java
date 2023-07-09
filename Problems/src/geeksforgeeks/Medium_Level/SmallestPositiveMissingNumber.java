package geeksforgeeks.Medium_Level;

import geeksforgeeks.School_Level.ReplaceAll0sWith5;

import java.util.Scanner;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++)
                arr[i] = sc.nextInt();

            System.out.println(new SmallestPositiveMissingNumber().missingNumber(arr,n));

        }
    }
    static int missingNumber(int arr[], int size) {
        // Your code here
        int correctIndex = 0;

        for(int i=0; i<size; i++) {
            correctIndex = arr[i]-1;

            while (arr[i] > 0 && arr[i] <= size && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

                correctIndex = arr[i]-1;
            }
        }
        for (int i=0; i<size; i++) {
            if (arr[i] != i+1) return i+1;
        }

        return size+1;

    }

}
/*
My Approach -
   /*   int smallestPositive = -1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, range = 0;

        for(int i=0; i<size; i++)  {
            if(arr[i] > max) max = arr[i];

            if(arr[i] > 0 && arr[i] < min ) min = arr[i];
        }

        for(int i=0; i<size-1; i++) {

            if((arr[i] + 1) > 0 && (arr[i]+1) < arr[i+1]) smallestPositive = arr[i]+1;
        }

        if(min != 1 ) smallestPositive = 1;
        else if(smallestPositive == -1)  smallestPositive = max+1;

        return smallestPositive;
        */

/*
You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.
Example 2:

Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing
number is 2.
Your Task:
The task is to complete the function missingNumber() which returns the smallest positive missing number in the array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
-106 <= arr[i] <= 106




 */