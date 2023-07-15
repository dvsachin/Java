package DataStructuresBasic.LinkedList;

public class Node {
    public int data;
    public Node next;
    public Node(int x){
        data=x;
        next=null;
    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}
