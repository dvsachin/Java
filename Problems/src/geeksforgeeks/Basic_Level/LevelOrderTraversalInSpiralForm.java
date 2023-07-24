package geeksforgeeks.Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
public class LevelOrderTraversalInSpiralForm {

    static  Node buildTree(String str) {
        if(str.length()==0 || str.charAt(0)=='N') return null;
        String[] ip = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int i=1;
        while (que.size()>0 && i<ip.length) {
            Node currNode = que.peek();
            que.remove();
            String curVal = ip[i];
            if(!curVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(curVal));
                que.add(currNode.left);
            }
            i++;
        }
        return root;
    }
    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-->0) {
            String s = br.readLine();
            Node root = buildTree(s);
            ArrayList<Integer> ans = new LevelOrderTraversalInSpiralForm().findSpiral(root);
            for (Integer x : ans)
                System.out.print(x+" ");
            System.out.println();
        }
    }
    //Function to return a list containing the level order
    //traversal in spiral form.
    ArrayList<Integer> findSpiral(Node root) {
        // Your code here
        Stack<Node> st1 = new Stack<>(), st2 = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        st1.push(root);
        while (!st1.isEmpty() || !st2.isEmpty()) {
            while (!st1.isEmpty()) {
                Node current = st1.peek();
                ans.add(current.data);
                st1.pop();

                if (current.right != null) st2.push(current.right);
                if (current.left != null) st2.push(current.left);
            }
            while (!st2.isEmpty()) {
                Node current = st2.peek();
                st2.pop();
                ans.add(current.data);
                if (current.left != null) st1.push(current.left);
                if (current.right != null) st1.push(current.right);
            }
        }
        return ans;
    }
}
/*
Given a binary tree and the task is to find the spiral order traversal of the tree.

Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right.

For below tree, function should return 1, 2, 3, 4, 5, 6, 7.

Example 1:

Input:
      1
    /   \
   3     2
Output:1 3 2

Example 2:

Input:
           10
         /     \
        20     30
      /    \
    40     60
Output: 10 20 30 60 40
Your Task:
The task is to complete the function findSpiral() which takes root node as input parameter and returns the elements in spiral form of level order traversal as a list. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 105
0 <= Data of a node <= 105


 */
