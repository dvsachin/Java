package geeksforgeeks.Medium_Level;

import java.util.HashMap;
import java.util.Map;

/* A Binary Tree node

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */
// https://practice.geeksforgeeks.org/problems/duplicate-subtree-in-binary-tree/1
public class DuplicateSubtreeInBinaryTree {
    int dupSub(Node root) {
        // code here
        HashMap<String,Integer> hm = new HashMap<>();
        solve(root.left,hm);
        solve(root.right,hm);

        for(Map.Entry<String,Integer> e : hm.entrySet()) if(e.getValue()>1) return 1;
        return 0;
    }

    String solve(Node node, HashMap<String,Integer> hm){
        StringBuilder sb = new StringBuilder();
        if(node==null) return "n";
        if(node.right==null && node.left==null) return node.data+",";

        sb.append(solve(node.left,hm));
        sb.append(solve(node.right,hm));
        sb.append(node.data).append(",");
        String s = sb.toString();
        hm.put(s,hm.getOrDefault(s,0)+1);
        return s;
    }
}
/*
Given a binary tree, find out whether it contains a duplicate sub-tree of size two or more, or not.

Note: Two same leaf nodes are not considered as subtree as size of a leaf node is one.

Example 1 :

Input :
               1
             /   \
           2       3
         /   \       \
        4     5       2
                     /  \
                    4    5
Output : 1
Explanation :
    2
  /   \
 4     5
is the duplicate sub-tree.
Example 2 :

Input :
               1
             /   \
           2       3
Output: 0
Explanation: There is no duplicate sub-tree
in the given binary tree.
Your Task:
You don't need to read input or print anything. Your task is to complete the function dupSub() which takes root of the tree as the only argument and returns 1 if the binary tree contains a duplicate sub-tree of size two or more, else 0.

Expected Time Complexity: O(N)
Expected Space Complexity: O(N)

Constraints:
0 ≤ Number of nodes ≤ 9

 */