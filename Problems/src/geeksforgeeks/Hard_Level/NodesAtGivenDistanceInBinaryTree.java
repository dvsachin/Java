package geeksforgeeks.Hard_Level;


import java.util.*;

public class NodesAtGivenDistanceInBinaryTree {
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int K) {
        // return the sorted list of all nodes at k dist
        ArrayList<Integer> res= new ArrayList<>();
        if(root == null) return res;
        HashMap<Node, Node> parentMap = new HashMap<>();
        findParent(parentMap, root);
        Queue<Node> q = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();
        q.add(new Node(target));

        while(!q.isEmpty()){
            int size= q.size();
            for(int i =0; i <size; i++){
                Node curr = q.poll();
                visited.add(curr);
                if(K == 0){
                    res.add(curr.data);
                }
                if(parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))){
                    q.add(parentMap.get(curr));
                }

                if(curr.left != null && !visited.contains(curr.left)){
                    q.add(curr.left);
                }

                if(curr.right != null && !visited.contains(curr.right)){
                    q.add(curr.right);
                }
            }
            K--;
            if(K < 0) break;
        }
        return res;
    }

    private static void findParent(HashMap<Node, Node> hm, Node root){
        if(root == null) return;
        if(root.left != null)
            hm.put(root.left, root);

        if(root.right != null)
            hm.put(root.right, root);

        findParent(hm, root.left);
        findParent(hm, root.right);
        return;
    }
}
