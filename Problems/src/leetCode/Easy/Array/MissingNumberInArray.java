package leetCode.Easy.Array;
// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
public class MissingNumberInArray {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int xo1 = 0, xo2= 0;
        int itr = n-1;

        for(int i=0; i<itr; i++) {
            xo2 = xo2 ^ array[i];
            xo1 = xo1 ^ (i+1);
        }

        xo1 = xo1 ^ n;
        return xo1 ^ xo2;
    }
}
/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9


Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106
 */
