package geeksforgeeks.Easy_Level;
// https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
public class EquilibriumPoint {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

    /* Approach 1 Time Complexity : O(2*n) , Space Complexity : O(1)
        // if(n==1) return 1;
        // long sum = 0;
        // for(long x : arr){
        //     sum+=x;
        // }

        // long sum1 = arr[0];
        // sum = sum-arr[0];

        // for(int i=1; i<n; i++){
        //     sum = sum - arr[i];
        //     if(sum==sum1) return i+1;
        //     sum1 = sum1+arr[i];
        // }
        // return -1;
    */

// Approach 2 Time Complexity : O(n) , Space Complexity : O(1)
        if(n==1) return 1;
        long s1 = arr[0], s2 = arr[n-1];
        int i=1,j=n-2;

        while(i<=j){
            if(s1==s2 && i==j) return i+1;
            if(s1<s2) s1+=arr[i++];
            else s2+=arr[j--];
        }

        return -1;
    }
}
/*Given an array A of n positive numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

Example 1:

Input:
n = 5
A[] = {1,3,5,2,2}
Output:
3
Explanation:
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2).
Example 2:

Input:
n = 1
A[] = {1}
Output:
1
Explanation:
Since there's only element hence its only the equilibrium point.
Your Task:
The task is to complete the function equilibriumPoint() which takes the array and n as input parameters and returns the point of equilibrium.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 105
1 <= A[i] <= 109


 */
