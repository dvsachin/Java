package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(read.readLine().trim());
            int[] arr = new int[n];

            String[] inputLine = read.readLine().trim().split(" ");

            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(inputLine[i]);

            ArrayList<Integer> ans  = new ValueEqualToIndexValue().valueEqualToIndex(arr, n);
            if(ans.size() == 0) System.out.println("Not Found");
            else {
                for (Integer x : ans)
                    System.out.print(x+" ");

                System.out.println();
            }
        }
    }

    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++)
            if(arr[i] == i+1) res.add(arr[i]);

        return res;
    }
}
/*
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

Example 1:

Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:

Input:
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.
Your Task:
You don't need to read input or print anything. Your task is to complete the function valueEqualToIndex() which takes the array of integers arr[] and n as parameters and returns an array of indices where the given conditions are satisfied. When there is no such element exists then return an empty array of length 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106
 */
