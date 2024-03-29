package geeksforgeeks.Basic_Level;

import DataStructuresBasic.LinkedList.Node;

import java.util.Scanner;

public class NodeAtGiveIndexInLinkedList {
    static Node head;
    public void addToLastNode(Node node) {
        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
                temp.next  = node;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- >0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            NodeAtGiveIndexInLinkedList ll = new NodeAtGiveIndexInLinkedList();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            ll.addToLastNode(head);

            for (int i=1; i<n;i++) {
                int a = sc.nextInt();
                ll.addToLastNode(new Node(a));
            }
            System.out.println(ll.getNth(head,k));
        }
    }
    public static int getNth(Node node, int ind) {
        //Your code here
        int ans = 0, count=1;

        while (node!= null && count<=ind) {
            if(count == ind) {
                ans = node.data;
                break;
            }
            count++;
            node = node.next;
        }
        return ans;

    }

}

/*
Given a singly linked list with N nodes and a number X. The task is to find the node at the given index (X)(1 based index) of linked list.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains space seperated two integers, length of linked list and X.

Output:
For each testcase, there will be single line of output containing data at Xth node.

User Task:
The task is to complete the function GetNth() which takes head reference and index as arguments and should return the data at Xth position in the linked list.

Constraints:
1 <= T <= 30
1 <= N <= 100
X <= N
1 <= value <= 103

Example:
Input:
2
6 5
1 2 3 4 657 76
10 2
8 7 10 8 6 1 20 91 21 2

Output:
657
7

Explanation:
Testcase 1: Element at 5th index in the linked list is 657 (1-based indexing).

 */