package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSmallerThanX {
    public static int smallerThanX(int arr[], int n, int x) {
        // Your code here
        int count = 0;

        for (int i=0; i<n; i++) {
            if(x > arr[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String[] str = read.readLine().split(" ");

            int[] input = new int[n];

            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(str[i]);
            }

            int x = Integer.parseInt(read.readLine());

            System.out.println((new CountSmallerThanX()).smallerThanX(input, n, x));

        }
    }
}

/*
Given an unsorted array arr[] of size N containing non-negative integers. You will also be given an integer X, the task is to count the number of elements which are strictly smaller than X. The given integer may or not be present in the array given.

Example 1:

Input:
N = 5
arr[] = {4 5 3 1 2}
X = 3
Output: 2
Explanation: Here X = 3, and elements that
are smaller than X are 1 and 2.
Example 2:

Input:
N = 6
arr[] = {2 2 2 2 2 2}
X = 3
Output: 6
Explanation: Here X = 3, and elements that
are smaller than X are 2 2 2 2 2 2.
Your Task:
Since this is a functional problem you don't have to worry about the input, you just have to complete the given function smallerThanX() which takes 3 arguments(array arr, N, and X) and returns the count of elements smaller than X. The printing is done by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 10^6
1 <= arr[i], X <= 10^5
 */