package geeksforgeeks.Medium_Level;

import DataStructuresBasic.LinkedList.Node;
import geeksforgeeks.School_Level.ExtractTheIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseLinkedListInGroupsOfGivenSize {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-->0) {
            int n = Integer.parseInt(read.readLine().trim());
            String[] input = read.readLine().trim().split(" ");
            int a1 = Integer.parseInt(input[0]);
            Node head = new Node(a1);
            Node tail = head;

            for (int i=1;i<n;i++) {
                int a = Integer.parseInt(input[i]);
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(read.readLine().trim());
            Node res = new ReverseLinkedListInGroupsOfGivenSize().reverse(head,k);

            while (res != null) {
                System.out.print(res.data+" ");
                res = res.next;
            }

        }
    }
    public static Node reverse(Node node, int k)   {
        //Your code here
        Node next=null, prev=null, curr = node;
        int temp = 0;


        while (curr!=null && temp < k) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

            temp++;
        }
        if(next != null)
            node.next = reverse(next,k);

        return prev;
    }
}
/*
Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should be considered as a group and must be reversed (See Example 2 for clarification).

Example 1:

Input:
LinkedList: 1->2->2->4->5->6->7->8
K = 4
Output: 4 2 2 1 8 7 6 5
Explanation:
The first 4 elements 1,2,2,4 are reversed first
and then the next 4 elements 5,6,7,8. Hence, the
resultant linked list is 4->2->2->1->8->7->6->5.
Example 2:

Input:
LinkedList: 1->2->3->4->5
K = 3
Output: 3 2 1 5 4
Explanation:
The first 3 elements are 1,2,3 are reversed
first and then elements 4,5 are reversed.Hence,
the resultant linked list is 3->2->1->5->4.
Your Task:
You don't need to read input or print anything. Your task is to complete the function reverse() which should reverse the linked list in group of size k and return the head of the modified linked list.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N <= 105
1 <= k <= N

 */
