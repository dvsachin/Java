package geeksforgeeks.Medium_Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
// https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1

/* Four sum - i and j constant (with 2 loops) then apply two sum (while-code) - Tc = O(n^3)
 * Three sum - i constant (with 1 loop) then apply two sum (while-code)  - Tc = O(n^2)
 * Two sum - (while-code) only  - Tc = O(n)
 */

public class FindAllFourSumNumbers {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int len = arr.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//      HashSet<ArrayList<Integer>> uniqueSet = new HashSet<>();

        for(int i=0; i<len; i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1; j<len; j++){
                if(j!=i+1 && arr[j]==arr[j-1]) continue;
                int m = j+1, n = len-1;

                while(m<n){
                    int sum = arr[i]+arr[j]+arr[m]+arr[n];
                    if(sum==k){
                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[m],arr[n]));
//                         if(!uniqueSet.contains(l)){
//                             list.add(l);
//                             uniqueSet.add(l);
//                         }
                        list.add(l);
                        m++;n--;
                        while(m<n && arr[m]==arr[m-1]) m++;
                        while(m<n && arr[n]==arr[n+1]) n--;
                    }
                    else if(sum<k) m++;
                    else n--;
                }
            }
        }
        return list;
    }
}
/*
Given an array A of integers and another number K. Find all the unique quadruple from the given array that sums up to K.

Also note that all the quadruples which you return should be internally sorted, ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.

Example 1:

Input:
N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2
Explanation: Sum of 0, 0, 1, 2 is equal
to K.
Example 2:

Input:
N = 7, K = 23
A[] = {10,2,3,4,5,7,8}
Output: 2 3 8 10
        2 4 7 10
        3 5 7 8
Explanation: Sum of 2, 3, 8, 10 = 23,
sum of 2, 4, 7, 10 = 23 and sum of 3,
5, 7, 8 = 23.
Your Task:
You don't need to read input or print anything. Your task is to complete the function fourSum() which takes the array arr[] and the integer k as its input and returns an array containing all the quadruples in a lexicographical manner. In the output each quadruple is separate by $. The printing is done by the driver's code.

Expected Time Complexity: O(N3).
Expected Auxiliary Space: O(N2).

Constraints:
1 <= N <= 100
-1000 <= K <= 1000
-100 <= A[] <= 100
 */