package geeksforgeeks.Basic_Level;

import java.util.HashMap;
import java.util.HashSet;
// https://www.geeksforgeeks.org/problems/count-element-occurences/1
public class CountMoreThannkOccurences {
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        HashMap<Integer,Integer> hm = new HashMap<>();
        k = n/k;
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
            if(hm.get(x)>k) set.add(x);
        }
        return set.size();
    }
}
/*
Given an array arr of size N and an element k. The task is to find the count of elements in the array that appear more than n/k times.

Example 1:

Input:
N = 8
arr = [3,1,2,2,1,2,3,3]
k = 4
Output:
2
Explanation:
In the given array, 3 and 2 are the only elements that appears more than n/k times.
Example 2:

Input:
N = 4
arr = [2,3,3,2]
k = 3
Output:
2
Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times. So the count of elements are 2.
Your Task:
The task is to complete the function countOccurence() which returns count of elements with more than n/k times appearance.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 105
1 <= a[i] <= 109
1 <= k <= N


 */