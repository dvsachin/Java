package geeksforgeeks.Medium_Level;
// https://www.geeksforgeeks.org/problems/merge-2-sorted-linked-list-in-reverse-order/1
public class Merge2SortedLinkedListInReverseOrder {
    Node mergeResult(Node node1, Node node2){
        Node n1 = reverse(node1);
        Node n2 = reverse(node2);

        return mergeRecur(n1,n2);

    }
    Node mergeRecur(Node A, Node B){

        if (A == null) return B;
        if (B == null) return A;

        if (A.data > B.data) {
            A.next = mergeRecur(A.next, B);
            return A;
        }
        else {
            B.next = mergeRecur(A, B.next);
            return B;
        }
    }

    Node reverse(Node node){
        Node prv = null;
        Node cur = node;

        while(cur!=null){
            Node next = cur.next;
            cur.next = prv;
            prv = cur;
            cur = next;
        }
        return prv;
    }
    static class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
}
/*
Given two linked lists of size N and M, which are sorted in non-decreasing order. The task is to merge them in such a way that the resulting list is in non-increasing order.

Example 1:

Input:
N = 2, M = 2
list1 = 1->3
list2 = 2->4
Output:
4->3->2->1
Explanation:
After merging the two lists in non-increasing order, we have new lists as 4->3->2->1.
Example 2:

Input:
N = 4, M = 3
list1 = 5->10->15->40
list2 = 2->3->20
Output:
40->20->15->10->5->3->2
Explanation:
After merging the two lists in non-increasing order, we have new lists as 40->20->15->10->5->3->2.
Your Task:
The task is to complete the function mergeResult() which takes reference to the heads of both linked list and returns the pointer to the merged linked list.

Expected Time Complexity : O(N+M)
Expected Auxiliary Space : O(1)

Constraints:
0 <= N, M <= 104


 */