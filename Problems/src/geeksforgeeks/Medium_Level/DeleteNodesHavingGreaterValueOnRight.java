package geeksforgeeks.Medium_Level;

import DataStructuresBasic.LinkedList.Node;
// https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1

public class DeleteNodesHavingGreaterValueOnRight {
    Node compute(Node head) {
        // your code here
        /* 1. reverse the given linked list */
        head = reverse(head);

        /* 2. compare the right node data is lesser than current node or not */
        Node temp = head;

        while(temp != null && temp.next !=null ) {
            if(temp.data > temp.next.data)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        /* 3. reverse the output linked list */
        return reverse(head);
    }

    Node reverse(Node head) {
        Node next = null, prev = null;

        while(head!=null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
/*
Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is greater. (Not just immidiate Right , but entire List on the Right)



Example 1:

Input:
LinkedList = 12->15->10->11->5->6->2->3
Output: 15 11 6 3
Explanation: Since, 12, 10, 5 and 2 are
the elements which have greater elements
on the following nodes. So, after deleting
them, the linked list would like be 15,
11, 6, 3.
Example 2:

Input:
LinkedList = 10->20->30->40->50->60
Output: 60
Explanation: All the nodes except the last
node has a greater value node on its right,
so all the nodes except the last node must
be removed.
Your Task:
The task is to complete the function compute() which should modify the list as required and return the head of the modified linked list. The printing is done by the driver code,

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


 */
