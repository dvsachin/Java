package geeksforgeeks.DataStrcutureBasics.LinkedList;

import DataStructuresBasic.LinkedList.Node;

import java.util.Scanner;

public class MaximumAndMinimumInLinkedList {
    static int maximum(Node head)  {
        // your code here
        if(head == null) return 0;
        int max = Integer.MIN_VALUE;

        while(head!=null) {
            if(max < head.data) max = head.data;
            head = head.next;
        }
        return max;
    }

    static int minimum(Node head) {
        // your code here
        if(head == null) return 0;
        int min = Integer.MAX_VALUE;

        while(head!=null) {
            if(min > head.data) min = head.data;
            head = head.next;
        }
        return min;
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
            System.out.println(new MaximumAndMinimumInLinkedList().maximum(head)+" "+new MaximumAndMinimumInLinkedList().minimum(head));
        }
    }
}

/*
Given a singly linked list of N elements. The task is to find the maximum and minimum element.

Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 5 1
Example 2:

Input:
LinkedList: 2->4->6->7->5->1->0
Output: 7 0
Your Task:
Your task is to complete the given functions both of which take head reference as argument and return maximum and minimum element as mentioned. The printing is done by driver code.

Constraints:
1 <= n <= 100
1 <= value <= 103

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


 */