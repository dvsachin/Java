package geeksforgeeks.Medium_Level;



import java.util.LinkedList;
import java.util.Queue;

// https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1
class Node {
    int data;
    Node left, right;
    Node(int key) {
        data = key;
        left = right = null;
    }
}
public class LeftMostAndRightMostNodesOfBinaryTree {
    public static void printCorner1(Node node) {
        // add your code here
        // TC = O(n*logn), SC = O(n);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (queue.size() > 0) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                Node c = queue.poll();
                if (i == 0 || i == n - 1) System.out.print(c.data + " ");
                if (c.left != null) queue.add(c.left);
                if (c.right != null) queue.add(c.right);
            }
        }

    }
    public static void printCorner2(Node node) {
        // add your code here
        // TC = O(n), SC = O(n);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        boolean flag = false;

        while (queue.size() > 0) {
            Node c = queue.poll();
            if(c == null) {
                flag = true;
                if(queue.size() == 0 ) break;
                else queue.add(null);
            }
            else  {
                if(queue.peek() == null || flag == true) {
                    System.out.print(c.data + " ");
                    flag = false;
                }
                if (c.left != null) queue.add(c.left);
                if (c.right != null) queue.add(c.right);
            }
        }
    }
}
/*
Given a Binary Tree of size N, Print the corner nodes ie- the node at the leftmost and rightmost of each level.

Example 1:

Input :
         1
       /  \
     2      3
    / \    / \
   4   5  6   7
Output: 1 2 3 4 7
Explanation:
Corners at level 0: 1
Corners at level 1: 2 3
Corners at level 2: 4 7
Example 2:

Input:

        10
      /    \
     20     30
    / \
   40  60
Output: 10 20 30 40 60
Your Task:
You dont need to read input. Complete the function printCorner() which takes root node as input parameter and prints the corner nodes separated by spaces. The left corner should be printed before the right for each level starting from level 0.
Note: Don't print a new line after printing all the corner nodes.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(number of nodes in a level)

Constraints:
1 ≤ N ≤ 10^5
 */