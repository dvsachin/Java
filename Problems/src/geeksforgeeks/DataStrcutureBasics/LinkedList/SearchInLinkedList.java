package geeksforgeeks.DataStrcutureBasics.LinkedList;

import DataStructuresBasic.LinkedList.Node;

import java.util.Scanner;

public class SearchInLinkedList {
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
            int x = sc.nextInt();

            if(new SearchInLinkedList().searchLinkedList(head,x))
                System.out.println(1);
            else System.out.println(0);
        }
    }
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        while (head!= null) {
            if(head.data == x) return true;
            head = head.next;
        }
        return false;
    }
}
/*
You are given a singly linked list of N elements, and also an element x. You need to find if x is present in the linked list or not.

Example 1:

Input:
LinkedList: 1->2->3->4->5
x = 4
Output: 1
Example 2:

Input:
LinkedList: 2->4->6->7->5->1->0
x = 10
Output: 0
Your Task:
Your task is to complete the given function searchLinkedList() which takes head reference and x as arguments and returns true if x is present else returns false. (1 is printed by the driver code if the returned value is true, otherwise 0)

Constraints:
1 <= n <= 100
1 <= x, value <= 103

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


 */