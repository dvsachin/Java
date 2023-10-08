package geeksforgeeks.Easy_Level;
import DataStructuresBasic.LinkedList.Node;
public class InsertInASortedList {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node given = new Node(key);
        Node link;
        Node temp = head1;

        if(temp.data > key) {
            given.next = head1;
            return given;
        }

        while(temp.next!=null && temp.next.data <= key ) {
            temp = temp.next;
        }
        if(temp.next == null) {
            temp.next = given;
        }
        else {
            link = temp.next;
            temp.next = given;
            given.next = link;
        }
        return head1;
    }
}
