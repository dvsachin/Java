package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindImmediateSmallerThanX {
    public static int immediateSmaller(int arr[], int n, int x)  {
        // Your code here
        int elementDiff = Integer.MAX_VALUE, immediateSmallerElement = 0;;

        for(int i=0; i<n; i++) {
            if(arr[i] < x && (x - arr[i]) < elementDiff )
                elementDiff = x - arr[i];
        }
        immediateSmallerElement = x - elementDiff;

        return immediateSmallerElement;
    }
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

            int x = Integer.parseInt(read.readLine());

            System.out.println((new FindImmediateSmallerThanX()).immediateSmaller(arr, n, x));

        }
    }
}
/*
Given an array arr[] of size N containing positive integers and an integer X, find the element in the array which is smaller than X and closest to it.



Example 1:

Input:
N = 5
arr[] = {4 67 13 12 15}
X = 16
Output: 15
Explanation: For a given value 16, there
are four values which are smaller than
it. But 15 is the number which is smaller
and closest to it with minimum difference
of 1.


Example 2:

Input:
N = 5
arr[] = {1 2 3 4 5}
X = 1
Output: -1
Explanation: No value is smaller than 1.


Your Task:
You don't need to read input or print anything. You need to complete the given function immediateSmaller() which takes arr, N and X as input parameters and returns the closest element that is smaller than X. If no such element exists, return -1.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 10^3
1 <= arr[i], X <= 10^4
 */