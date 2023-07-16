package geeksforgeeks.DataStrcutureBasics.LinkedList;

import DataStructuresBasic.LinkedList.Node;

import java.nio.channels.NonWritableChannelException;
import java.util.Map;
import java.util.Scanner;

public class InsertINMiddleOfLinkedList {
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        if(head == null) return null;
        Node node = new Node(data);

        int length = 0;
        Node temp = head;
        while (temp!= null) {
            temp = temp.next;
            length++;
        }

        int index = (int) Math.ceil((length)/2.0);

        while (head.next!=null && index > 1) { // 1 based indexing
            head = head.next;
            index--;
        }
        node.next = head.next;
        head.next = node;

        return head;

    }
    static void display(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i=0; i<n-1;i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            new InsertINMiddleOfLinkedList().insertInMid(head,key);
            display(head);
            System.out.println();
        }
    }
}
/*
Given a linked list of size N and a key. The task is to insert the key in the middle of the linked list.

Example 1:

Input:
LinkedList = 1->2->4
key = 3
Output: 1 2 3 4
Explanation: The new element is inserted
after the current middle element in the
linked list.
Example 2:

Input:
LinkedList = 10->20->40->50
key = 30
Output: 10 20 30 40 50
Explanation: The new element is inserted
after the current middle element in the
linked list and Hence, the output is
10 20 30 40 50.


Your Task:
The task is to complete the function insertInMiddle() which takes head reference and element to be inserted as the arguments. The printing is done automatically by the driver code.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N <= 104


 */