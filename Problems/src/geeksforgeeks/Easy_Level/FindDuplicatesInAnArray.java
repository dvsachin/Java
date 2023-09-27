package geeksforgeeks.Easy_Level;

import java.util.ArrayList;
import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1
public class FindDuplicatesInAnArray {
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1,-1));
        int i=0, j=m-1;
        int diff = (int)1e9;

        while(i<n && j>=0){
            int sum = arr[i]+brr[j];
            if(abs(sum,x)<diff){
                diff = abs(sum,x);
                list.set(0,arr[i]);
                list.set(1,brr[j]);
            }
            if(sum<x) i++;
            else j--;
        }
        return list;
    }

    static int abs(int a, int b){
        if(a>b) return a-b;
        return b-a;
    }
}
/*
Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1].

Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output:
-1
Explanation:
There is no repeating element in the array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output:
2 3
Explanation:
2 and 3 occur more than once in the given array.
Your Task:
Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in a sorted manner.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= N <= 105
0 <= A[i] <= N-1, for each valid i
 */