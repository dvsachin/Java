package leetCode.Easy;

import leetCode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// https://leetcode.com/problems/find-mode-in-binary-search-tree/
public class FindModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        List<Integer> inorderr = new ArrayList<>();
        inorder(root, inorderr);

        Map<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0;

        for (int val : inorderr) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            maxCount = Math.max(maxCount, freq.get(val));
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    private void inorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        inorder(root.left, result);
        inorder(root.right, result);
    }

}
/*
Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:


Input: root = [1,null,2,2]
Output: [2]
Example 2:

Input: root = [0]
Output: [0]


Constraints:

The number of nodes in the tree is in the range [1, 104].
-105 <= Node.val <= 105


Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
 */
