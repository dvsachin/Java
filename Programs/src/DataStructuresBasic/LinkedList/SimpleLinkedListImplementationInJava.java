package DataStructuresBasic.LinkedList;

public class SimpleLinkedListImplementationInJava {

    public static void main(String args[]) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        System.out.print(head.data+"-->"+temp1.data+"-->"+temp2.data);

    }
}
