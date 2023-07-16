package geeksforgeeks.DataStrcutureBasics.LinkedList;

import DataStructuresBasic.LinkedList.Node;

import java.util.Scanner;

public class LinkedListInsertion {
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x) {
        // code here
        Node node = new Node(x);
        node.next = head;
        return node;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node node = new Node(x);
        if(head == null) return node;

        Node temp = head;

        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = node;

        return head;
    }
    static void printList(Node head) {
        while (head!= null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            Node head = null;

            LinkedListInsertion ob = new LinkedListInsertion();
            for (int i=0; i<n;i++) {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                if(indicator == 0) head = ob.insertAtBeginning(head,value);
                else head = ob.insertAtEnd(head,value);
            }
            printList(head);
        }
    }
}

/*
Create a link list of size N according to the given input literals. Each integer input is accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the beginning of the link list. If it is 1, insert the integer at the end of the link list.
Hint: When inserting at the end, make sure that you handle NULL explicitly.

Example 1:

Input:
LinkedList: 9->0->5->1->6->1->2->0->5->0
Output: 5 2 9 5 6
Explanation:
Length of Link List = N = 5
9 0 indicated that 9 should be
inserted in the beginning. Modified
Link List = 9.
5 1 indicated that 5 should be
inserted in the end. Modified Link
List = 9,5.
6 1 indicated that 6 should be
inserted in the end. Modified Link
List = 9,5,6.
2 0 indicated that 2 should be
inserted in the beginning. Modified
Link List = 2,9,5,6.
5 0 indicated that 5 should be
inserted in the beginning. Modified
Link List = 5,2,9,5,6.
Final linked list = 5, 2, 9, 5, 6.

Example 2:

Input:
LinkedList: 5->1->6->1->9->1
Output: 5 6 9

Your Task:
You only need to complete the functions insertAtBeginning() and insertAtEnd() that takes the head of link list and integer value of the data to be inserted as inputs and returns the head of the modified link list.

Expected Time Complexity: O(1) for insertAtBeginning() and O(N) for insertAtEnd().
Expected Auxiliary Space: O(1) for both.

Constraints:
1 <= N <= 104


 */