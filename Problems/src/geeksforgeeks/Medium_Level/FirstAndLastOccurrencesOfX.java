package geeksforgeeks.Medium_Level;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
public class FirstAndLastOccurrencesOfX {
    ArrayList<Integer> find(int arr[], int n, int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int leftIndex = findLeftIndex(arr, 0,n-1,x);
        int rightIndex = findRightIndex(arr,0,n-1,x);

        ans.add(leftIndex);
        ans.add(rightIndex);
        return ans;
    }
    int findLeftIndex(int[] arr , int l, int r, int x) {
        int result = -1;

        while (l<=r) {
            int m = (l+r)/2;
            if(arr[m] < x) l = m+1;
            else {
                if(arr[m] == x) result = m;
                r = m-1;
            }
        }
        return result;
    }
    int findRightIndex(int[] arr, int l, int r, int x) {
        int result = -1;

        while (l<=r) {
            int m = (l+r)/2;
            if(arr[m] > x)  r = m-1;
            else {
                if(arr[m] == x) result = m;
                l = m+1;
            }
        }
        return result;
    }
}
/*
Given a sorted array arr containing n elements with possibly duplicate is to find indexes of first elements, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.


Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:
2 5
Explanation:
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:
6 6
Explanation:
First and last occurrence of 7 is at index 6.
Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106
1 ≤ arr[i],x ≤ 109

 */