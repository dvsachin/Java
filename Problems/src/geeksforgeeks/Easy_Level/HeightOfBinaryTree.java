package geeksforgeeks.Easy_Level;
/*
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
// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
public class HeightOfBinaryTree {
    //Function to find the height of a binary tree.
    int height(Node node)  {
            // code here
        if(node == null) return  0;
        else
            return Math.max(height(node.left), height(node.right)) + 1 ;
    }
}
/*
 * Algorithm:
     * 1. If tree is empty then return 0
     * 2. Else
         * (a) Get the max depth of left subtree recursively i.e., call maxDepth ( tree->left-subtree)
         * (b) Get the max depth of right subtree recursively i.e., call maxDepth ( tree->right-subtree)
         * (c) Get the max of max depths of left and right subtrees and add 1 to it for the current node.
             * max_depth = max(max dept of left subtree,max depth of right subtree) + 1
         * (d) Return max_depth
/*

Given a binary tree, find its height.

Example 1:

Input:
     1
    /  \
   2    3
Output: 2
Example 2:

Input:
  2
   \
    1
   /
 3
Output: 3
Your Task:
You don't need to read input or print anything. Your task is to complete the function height() which takes root node of the tree as input parameter and returns an integer denoting the height of the tree. If the tree is empty, return 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 109
 */