package geeksforgeeks.Easy_Level;

import java.util.ArrayList;
import java.util.List;

public class RightViewOfBinaryTree {
    class Node
    {
        int data;
        Node left, right;
        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ans = new ArrayList<Integer>();
        rightView(node,ans,0);
        return ans;
    }

    public void rightView(Node current, List<Integer> ans, int currDepth) {
        if(current == null)
            return;
        if(currDepth == ans.size())
            ans.add(current.data);

        rightView(current.right, ans, currDepth+1);
        rightView(current.left, ans, currDepth+1);

    }


}
