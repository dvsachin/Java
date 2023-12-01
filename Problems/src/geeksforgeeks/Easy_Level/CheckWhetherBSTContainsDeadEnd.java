package geeksforgeeks.Easy_Level;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1
public class CheckWhetherBSTContainsDeadEnd {
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        solve(root,set,list);
        // for(int x: list) System.out.print(x+" ");

        for(int x : list){
            if(x==1 && set.contains(x+1)) return true;
            else if(set.contains(x-1) && set.contains(x+1)) return true;
        }
        return false;
    }
    static void solve(Node node, HashSet<Integer> set, List<Integer> list){
        if(node==null) return;
        if(node.left==null && node.right==null) list.add(node.data);
        solve(node.left,set,list);
        set.add(node.data);
        solve(node.right,set,list);
    }

    /*
approach 2  (min and max)

class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        return solve(root,1,10002);
    }
    static boolean solve(Node node, int a, int b){
        if(node==null) return false;
        if(a==b) return true;

        boolean left = solve(node.left,a,node.data-1);
        boolean right = solve(node.right,node.data+1,b);

        return left || right;
    }
}

*/

}
/*
Given a Binary Search Tree that contains unique positive integer values greater than 0. The task is to complete the function isDeadEnd which returns true if the BST contains a dead end else returns false. Here Dead End means a leaf node, at which no other node can be inserted.

Example 1:

Input :
               8
             /   \
           5      9
         /  \
        2    7
       /
      1

Output :
Yes
Explanation :
Node 1 is a Dead End in the given BST.
Example 2:

Input :
              8
            /   \
           7     10
         /      /   \
        2      9     13

Output :
Yes
Explanation :
Node 9 is a Dead End in the given BST.
Your Task: You don't have to input or print anything. Complete the function isDeadEnd() which takes BST as input and returns a boolean value.

Expected Time Complexity: O(N), where N is the number of nodes in the BST.
Expected Space Complexity: O(N)

Constraints:
1 <= N <= 1001
1 <= Value of Nodes <= 10001
 */