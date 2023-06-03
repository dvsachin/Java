package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String[] str = read.readLine().split(" ");

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            new ReverseTheArray().reverseArray(arr,n);

            for(int x : arr)
                System.out.print(x+" ");
            System.out.println();

        }

    }
    public static void reverseArray(int arr[], int n) {
        // Your code here
        int temp = 0;

        for(int i=0; i<n/2; i++) {
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}
/*
Given an array arr of size n. You need to reverse the array.

Example 1:

Input:
n = 5
arr[] = {1 1 2 2 3}
Output: 3 2 2 1 1
Example 2:

Input:
n = 2
arr[] = {4 2}
Output: 2 4
Your Task:
You just need to complete the function reverseArray() that takes arr and n as parameters and reverses arr. The driver code then prints arr.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n  <= 106
1 <= arri <= 106
 */