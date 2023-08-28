package geeksforgeeks.Easy_Level;
import DataStructuresBasic.LinkedList.Node;

public class RemoveDuplicateElementFromSortedLinkedList {
    Node removeDuplicates(Node head)  {
        // Your code here
        Node temp = head;

        while(temp!=null && temp.next!=null) {
            if(temp.data == temp.next.data)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return head;

    }
}
