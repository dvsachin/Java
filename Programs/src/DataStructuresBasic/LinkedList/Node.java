package DataStructuresBasic.LinkedList;

public class Node {
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}
