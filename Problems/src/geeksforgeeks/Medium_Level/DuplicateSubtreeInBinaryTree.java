package geeksforgeeks.Medium_Level;
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
        return 0;
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