package geeksforgeeks.Easy_Level;

import java.util.LinkedList;
import java.util.Queue;
// https://practice.geeksforgeeks.org/problems/leaf-under-budget/1

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}
class Pair{
    Node a;
    int b;
    Pair(Node a, int b){
        this.a = a;
        this.b = b;
    }
}

public class LeafUnderBudget {
    public int getCount(Node node, int bud) {
        //code here
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,1));
        int count = 0;
        int sum = 0;

        while(q.size()>0){
            Node temp = q.peek().a;
            int lvl = q.peek().b;
            q.remove();
            if(temp.left==null && temp.right==null){
                count++;
                sum = sum + lvl;
                if(sum>bud) return count-1;
                if(sum==bud) return count;
            }
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
        }
        return count;
    }
}

/*
Given a binary tree and a budget. Assume you are at the root of the tree(level 1), you need to maximise the count of leaf nodes you can visit in your budget if the cost of visiting a leaf node is equal to the level of that leaf node.

Example 1:

Input:
                  10
                /    \
               8      2
             /      /   \
            3      3     6
                    \
                     4
and budget = 8
Output: 2
Explanation:
Cost For visiting Leaf Node 3: 3
Cost For visiting Leaf Node 4: 4
Cost For visiting Leaf Node 6: 3
In budget 8 one can visit Max 2 Leaf Nodes.
Example 2:

Input:
         1
       /   \
      2     3
     / \   / \
    4   5 6   7
and budget = 5
Output: 1
Explanation: We can only visit either node 4 or 5.
Your Task:

You don't need to read input or print anything. Your task is to complete the function getCount() which takes root node of the tree and a integer denoting the budget as input parameters and returns an integer denoting the count of visited leaf nodes of the tree.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 */