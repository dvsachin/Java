package geeksforgeeks.Easy_Level;

import java.util.HashMap;
import java.util.PriorityQueue;
// https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
public class TopKFrequentElementsInArray {
    public int[] topK(int[] nums, int k) {
        // Code here
        int[] arr = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();

        int n = nums.length;
        for(int i=0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
            if(hm.get(a)==hm.get(b)) return b-a;
            return hm.get(b)-hm.get(a);

        });

        for(int key : hm.keySet()){
            pq.add(key);
        }

        for(int i=0; i<k; i++){
            arr[i] = pq.remove();
        }

        return arr;
    }
}
/*
Given a non-empty array nums[] of integers of length N, find the top k elements which have the highest frequency in the array. If two numbers have same frequencies, then the larger number should be given more preference.

Example 1:

Input:
N = 6
nums = {1,1,1,2,2,3}
k = 2
Output: {1, 2}
Example 2:

Input:
N = 8
nums = {1,1,2,2,3,3,3,4}
k = 2
Output: {3, 2}
Explanation: Elements 1 and 2 have the
same frequency ie. 2. Therefore, in this
case, the answer includes the element 2
as 2 > 1.
User Task:
You don't have to read or print anything. You will have to complete the function topK() that takes an array nums[] and integer k as input and returns a list of top k most frequent elements. If any two elements have same frequencies, then give more preference to the larger elemet.

Expected Time Complexity : O(NlogN)
Expected Auxilliary Space : O(N)

Constraints:
1 <= N <= 105
1<= nums[i] <=105
1 <= k <= N
 */