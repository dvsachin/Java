package geeksforgeeks.Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-->0) {
            int n = Integer.parseInt(read.readLine());
            Queue<Integer> q = new LinkedList<>();
            String s = read.readLine();
            String[] a = s.split(" ");

            for (String x : a) {
                q.add(Integer.parseInt(x));
            }

            q = new QueueReversal().rev(q);

            while (!q.isEmpty()) {
                System.out.print(q.peek()+ " ");
                q.poll();
            }
            System.out.println();
        }
    }
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> temp = new Stack<>();

        while (!q.isEmpty()) {
            temp.add(q.poll());
        }
        while (!temp.isEmpty()) {
            q.add(temp.pop());
        }
        return q;

        /* // StackOverFlow Error @ 1130 testcase
        if(q.isEmpty())
            return q;

        int x = q.poll();
        q = rev(q);
        q.add(x);

        return q;

         */

    }
}
/*
Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.

Example 1:

Input:
6
4 3 1 10 2 6
Output:
6 2 10 1 3 4
Explanation:
After reversing the given elements of the queue , the resultant queue will be 6 2 10 1 3 4.
Example 2:

Input:
4
4 3 2 1
Output:
1 2 3 4
Explanation:
After reversing the given elements of the queue , the resultant queue will be 1 2 3 4.
Your Task: You need to complete the function rev that takes a queue as parameter and returns the reversed queue. The printing is done automatically by the driver code.

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 ≤ N ≤ 105
1 ≤ elements of Queue ≤ 105
 */
