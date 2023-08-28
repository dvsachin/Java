package leetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingSingleQueue {
    Queue<Integer> q;

    ImplementStackUsingSingleQueue() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        // add an element to queue first
        q.offer(x);

        // remove from n-1 elements from head of queue and add at rear of queue
        for(int i=0; i<q.size()-1; i++) {
            q.offer(q.peek());
            q.poll();
        }
    }

    public int pop() {
        // simple remove and return the head element of queue
        return q.poll();
    }

    public int top() {
        // simple return the head element of queue
        return q.peek();
    }

    public boolean empty() {
        // check queue is empty or not
        return q.isEmpty();
    }

}
