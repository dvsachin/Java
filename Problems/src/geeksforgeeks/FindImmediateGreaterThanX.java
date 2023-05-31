package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindImmediateGreaterThanX {

    public static int immediateGreater(int arr[], int n, int x)
    {
        // Your code here
        int elementDiff = Integer.MAX_VALUE, immediateGreaterElement = 0;;

        for(int i=0; i<n; i++) {
            if(arr[i] > x && (arr[i] - x) < elementDiff )
                elementDiff =  arr[i] - x;
        }

        if((x + elementDiff) <= x) return -1;
        else immediateGreaterElement = x + elementDiff;

        return immediateGreaterElement;
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

            System.out.println((new FindImmediateGreaterThanX()).immediateGreater(arr, n, x));

        }

    }
}
/*
Given an array arr[] of size N containing positive integers and an integer X. You need to find the value in the array which is greater than X and closest to it. ( if no such value exists the answer should be -1)

Example 1:

Input:
N = 5
arr[] = {4 67 13 12 15}
X = 16
Output: 67
Explanation: For a given value 16, there
is only one value 67 that greater than
it and so it is the answer.
Example 2:

Input:
N = 5
arr[] = {1 2 3 4 5}
X = 1
Output: 2
Explanation: For a given value 1, there
are 4 values greater than it 2 3 4 5.
But 2 is closest to 1 so it is the answer
Your Task:
Since this is a functional problem, you need to complete the given function immediateGreater() which takes 3 arguments(array arr, N and X) and returns the answer. The printing is done by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 103
1 <= arr[i], X <= 104
 */