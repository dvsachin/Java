package geeksforgeeks.DataStrcutureBasics.LinkedList;

import DataStructuresBasic.LinkedList.Node;

import java.util.Scanner;
import java.util.Stack;

public class CountNodesOfLinkedList {
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
            System.out.println(new CountNodesOfLinkedList().getCount(head));
        }
    }
    public static int getCount(Node head) {

        //Code here
        int count = 0;
        if(head == null) return 0;

        while (head!= null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 5
Explanation: Count of nodes in the
linked list is 5, which is its length.
Example 2:

Input:
LinkedList: 2->4->6->7->5->1->0
Output: 7
Explanation: Count of nodes in the
linked list is 7. Hence, the output
is 7.
Your Task:
Your task is to complete the given function getCount(), which takes a head reference as an argument and should return the length of the linked list.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N <= 105
1 <= value <= 103


 */
