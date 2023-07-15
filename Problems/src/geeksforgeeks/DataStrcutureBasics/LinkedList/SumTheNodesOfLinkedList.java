package geeksforgeeks.DataStrcutureBasics.LinkedList;

import DataStructuresBasic.LinkedList.Node;

import java.util.Scanner;

public class SumTheNodesOfLinkedList {
    public static Node insertNode(Node head, int x) {
        Node node = new Node(x);
        if(head == null) return node;

        Node temp = head;
        while (temp!= null) {
            temp = temp.next;
            temp.next = node;
        }
        return head;
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
            System.out.println(new SumTheNodesOfLinkedList().sumOfElements(head));
        }
    }
    public static int sumOfElements(Node head) {
        // your code here
        int sum = 0;

        while(head!=null) {
            sum = sum + head.data;
            head = head.next;
        }
        return sum;
    }

}
/*
Given a singly linked list of size N. The task is to sum the elements of the linked list.

Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 15
Example 2:

Input:
LinkedList: 2->4->6->7->5->1->0
Output: 25


Your Task:
Your task is to complete the given function sumOfElements(), which takes head reference as argument and should return the sum of all the nodes in the Linked List.

Constraints:
1 <= n <= 100
1 <= value <= 103

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 */