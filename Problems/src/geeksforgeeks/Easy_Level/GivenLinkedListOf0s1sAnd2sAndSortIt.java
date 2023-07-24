package geeksforgeeks.Easy_Level;

import DataStructuresBasic.LinkedList.Node;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GivenLinkedListOf0s1sAnd2sAndSortIt {
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-->0) {
            int n = Integer.parseInt(reader.readLine().trim());
            String[] s = reader.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i=1; i<n;i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }
            head = new GivenLinkedListOf0s1sAnd2sAndSortIt().segregate(head);

            while (head!= null) {
                System.out.print(head.data+ " ");
                head = head.next;
            }

        }

    }
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node current = head;

        while (current != null) {
            if(current.data == 0) {
                zeroTail.next = current;
                zeroTail = current;
            }
            if(current.data == 1){
                oneTail.next = current;
                oneTail = current;
            }
            if(current.data == 2){
                twoTail.next = current;
                twoTail = current;
            }
            current = current.next;
        }

        if(oneHead.next != null) {
            zeroTail.next = oneHead.next;
        }
        else {
            zeroTail.next = twoHead.next;
        }
        oneTail.next = twoHead.next;
        twoTail.next = null;

        head = zeroHead.next;

        return head;
    }

}
/*
Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:

Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.
Example 2:

Input:
N = 4
value[] = {2,2,0,1}
Output: 0 1 2 2
Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.
Your Task:
The task is to complete the function segregate() which segregates the nodes in the linked list as asked in the problem statement and returns the head of the modified linked list. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 106
 */
