package geeksforgeeks.Basic_Level;

import DataStructuresBasic.LinkedList.Node;

import java.util.Scanner;

public class PrintLinkedListElements {
    Node head;
    public void addToLastNode(Node node) {
        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp!= null) {
                temp = temp.next;
            }
            temp.next  = node;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- >0) {
            int n = sc.nextInt();
            PrintLinkedListElements ll = new PrintLinkedListElements();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            ll.addToLastNode(head);

            for (int i=1; i<n;i++) {
                int a = sc.nextInt();
                ll.addToLastNode(new Node(a));
            }
            ll.display(ll.head);
            System.out.println();
        }
    }
    void display(Node head) {
        //add code here.
        if (head == null) return;

        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}

/*
Given a linked list. Print all the elements of the linked list.

Note :- End of Line is handled by driver code itself. You just have to end with a single space.

Example 1:

Input:
N=2
LinkedList={1 , 2}
Output:
1 2
Explanation:
The linked list contains two
elements 1 and 2.The elements
are printed in a single line.
Example 2:

Input:
N = 3
Linked List = { 49, 10, 30}
Output:
49 10 30
Explanation:
The linked list contains 3
elements 49, 10 and 30. The
elements are printed in a single
line.
Your task:
You don't need to read input or print anything. Your task is to complete the function display() which takes the head of the linked list as input and prints the linked list in a single line.

Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)

Constraints :
1 <= N <= 100
 */