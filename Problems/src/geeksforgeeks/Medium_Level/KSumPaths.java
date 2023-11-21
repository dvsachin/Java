package geeksforgeeks.Medium_Level;

import java.util.HashMap;
// https://www.geeksforgeeks.org/problems/k-sum-paths/1
public class KSumPaths {
    private int count = 0;
    public int sumK(Node root,int k)
    {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        totalPaths(root,hm,k,0);
        return count;
    }

    private void totalPaths(Node node, HashMap<Integer,Integer> hm, int k, int sum){
        if(node==null) return;
        sum += node.data;
        if(hm.containsKey(sum-k)) count+= hm.get(sum-k);
        // if(sum==k) count++;
        hm.put(sum,hm.getOrDefault(sum,0)+1);
        totalPaths(node.left,hm,k,sum);
        totalPaths(node.right,hm,k,sum);
        hm.put(sum,hm.get(sum)-1);
    }
}
/*
Given a binary tree and an integer K. Find the number of paths in the tree which have their sum equal to K.
A path may start from any node and end at any node in the downward direction.
Since the answer may be very large, compute it modulo 109+7.

Example 1:

Input:
Tree =
          1
        /   \
       2     3
K = 3
Output:
2
Explanation:
Path 1 : 1 + 2 = 3
Path 2 : only leaf node 3
Example 2:

Input:
Tree =
           1
        /     \
      3        -1
    /   \     /   \
   2     1   4     5
        /   / \     \
       1   1   2     6
K = 5
Output:
8
Explanation:
The following paths sum to K.
3 2
3 1 1
1 3 1
4 1
1 -1 4 1
-1 4 2
5
1 -1 5
Your Task:
You don't need to read input or print anything. Complete the function sumK() which takes root node and integer K as input parameters and returns the number of paths that have sum K.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(Height of Tree)

Constraints:
1 ≤ N ≤ 2*104
-105 ≤ Node Value ≤ 105
-109 ≤ K ≤ 109
 */
