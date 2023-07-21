package geeksforgeeks.Easy_Level;

import DataStructuresBasic.LinkedList.Node;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromAnUnsortedLinkedList {
    Node head;
    Node temp;

    public void addToLastNode(Node node) {
        if(head == null) {
            head = node;
            temp = node;
        }
        else {
            temp.next  = node;
            temp = node;
        }
    }
    void printList() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-->0) {
            int n = Integer.parseInt(reader.readLine().trim());
            RemoveDuplicatesFromAnUnsortedLinkedList ll = new RemoveDuplicatesFromAnUnsortedLinkedList();
            String[] s = reader.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            ll.addToLastNode(head);
            for (int i=1; i<n;i++) {
                int a = Integer.parseInt(s[i]);
                ll.addToLastNode(new Node(a));
            }
            ll.head = ll.removeDuplicates(ll.head);
            ll.printList();
        }

    }
    public Node removeDuplicates(Node head) {
        // Your code here
        Map<Integer,Boolean> visited = new HashMap<>();
        Node current = head, previous = head;

        while (current!=null) {
            if(visited.containsKey(current.data)) { // if present
                previous.next = current.next;
                current = current.next;
            }
            else {
                visited.put(current.data, true); // if absent
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

}
/*
Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.

Example 1:

Input:
N = 4
value[] = {5,2,2,4}
Output: 5 2 4
Explanation:Given linked list elements are
5->2->2->4, in which 2 is repeated only.
So, we will delete the extra repeated
elements 2 from the linked list and the
resultant linked list will contain 5->2->4
Example 2:

Input:
N = 5
value[] = {2,2,2,2,2}
Output: 2
Explanation:Given linked list elements are
2->2->2->2->2, in which 2 is repeated. So,
we will delete the extra repeated elements
2 from the linked list and the resultant
linked list will contain only 2.
Your Task:
You have to complete the method removeDuplicates() which takes 1 argument: the head of the linked list.  Your function should return a pointer to a linked list with no duplicate element.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= size of linked lists <= 106
0 <= numbers in list <= 104


 */