package geeksforgeeks.Easy_Level;

import DataStructuresBasic.LinkedList.Node;
// https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
public class DeleteANodeInSingleLinkedList {
    Node deleteNode(Node head, int x) {
        // Your code here
        int index = 0;
        if(x == 1) {
            head = head.next;
            return head;
        }

        Node temp = head;

        while(temp != null && temp.next != null) {
            index++;
            if(x == (index+1)) {
                temp.next = temp.next.next;
                break;
            }
            else
                temp = temp.next;
        }
        return head;
    }
}
