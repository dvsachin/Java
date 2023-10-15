package geeksforgeeks.Easy_Level;

import java.util.ArrayList;
// https://github.com/puneet2501/gfgPOTD/blob/main/java/Normal%20BST%20to%20Balanced%20BST.java
public class NormalBSTToBalancedBST {
    Node buildBalancedTree(Node root) {
        //Add your code here.
        ArrayList<Node> list = new ArrayList<>();
        inorder(root,list);
        return bbst(list,0,list.size()-1);
    }
    void inorder(Node root, ArrayList<Node> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
    Node bbst(ArrayList<Node> list, int l, int r){
        if(l>r) return null;

        int mid = (l+r)/2;

        Node root = list.get(mid);
        root.left = bbst(list,l,mid-1);
        root.right = bbst(list,mid+1,r);

        return root;
    }
}

/*
Given a Binary Search Tree, modify the given BST such that it is balanced and has minimum possible height. Return the balanced BST.

Example1:

Input:
       30
      /
     20
    /
   10
Output:
     20
   /   \
 10     30
Example2:

Input:
         4
        /
       3
      /
     2
    /
   1
Output:
      3            3           2
    /  \         /  \        /  \
   1    4   OR  2    4  OR  1    3
    \          /                  \
     2        1                    4

Your Task:
The task is to complete the function buildBalancedTree() which takes root as the input argument and returns the root of tree after converting the given BST into a balanced BST with minimum possible height. The driver code will print the height of the updated tree in output itself.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Here N denotes total number of nodes in given BST.

Constraints:
1 <= N <= 105
1 <= Node data <= 109

 */