package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetElementAtIndex {
    public static int getByIndex(int arr[], int n, int i)
    {
        // Your code here
        if(i >= n)
            return -1;
        else if( i < 0)
            return 0;
        else
            return arr[i];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String[] str = read.readLine().split(" ");

            int[] input = new int[n];

            for (int i =0; i<n; i++) {
                input[i] = Integer.parseInt(str[i]);
            }

            int index = Integer.parseInt(read.readLine());

            System.out.println(GetElementAtIndex.getByIndex(input,n,index));

        }


    }
}

/*
You are given an array arr(0-based indexing). The size of the array is given by n. You need to get the element at index i and return it. If no element exists at i then return -1.

Example 1:

Input:
n = =6
arr[] = {1 2 3 4 5 6}
index = 0
Output: 1
Explanation: The array is {1 2 3 4 5 6}.
The index given is 0. so element at 0th
index is 1.
Example 2:

Input:
n = 4
arr[] = {1 2 3 4}
index = 4
Output: -1
Explanation: The array is {1 2 3 4}. The
index given is 4. Here no element exists
at the 4th index, so the answer is -1.
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function getByIndex() that takes arr, n, i as input and return the required result.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n<= 103
0 <= arri <= 10^6
1 <= index <= 10^6
 */