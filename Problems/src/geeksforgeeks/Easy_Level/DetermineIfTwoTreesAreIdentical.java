package geeksforgeeks.Easy_Level;

import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
public class DetermineIfTwoTreesAreIdentical {
    boolean isIdentical_1(Node root1, Node root2) {
// approach 1 without recursion (bfs)
        if(root1.data!=root2.data) return false;
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.add(root1); q2.add(root2);

        while(true){

            Node a = q1.remove();
            Node b = q2.remove();

            if(a.data!=b.data) return false;

            if(a.left != null) q1.add(a.left);
            if(a.right!=null) q1.add(a.right);
            if(b.left!=null) q2.add(b.left);
            if(b.right!=null) q2.add(b.right);

            if(q1.size()==0 || q2.size()==0) break;
        }
        if(q1.size()!=q2.size()) return false;
        return true;
    }


    // approach 1 using dfs(recursion)
    boolean isIdentical_2(Node a, Node b) {
        // Code Here
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.data!=b.data) return false;
        return isIdentical_2(a.left,b.left) && isIdentical_2(a.right,b.right);
    }
}


/*
Given two binary trees, the task is to find if both of them are identical or not.
Note: You need to return true or false, the printing is done by the driver code.

Example 1:

Input:
     1          1
   /   \      /   \
  2     3    2     3
Output:
Yes
Explanation:
There are two trees both having 3 nodes and 2 edges, both trees are identical having the root as 1, left child of 1 is 2 and right child of 1 is 3.
Example 2:

Input:
    1       1
  /  \     /  \
 2    3   3    2
Output:
No
Explanation: There are two trees both having 3 nodes and 2 edges, but both trees are not identical.
Your task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function isIdentical() that takes two roots as parameters and returns true or false. The printing is done by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <= Number of nodes <= 105
1 <=Data of a node <= 109


 */