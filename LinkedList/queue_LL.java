import java.util.*;

import javax.swing.plaf.TableUI;
public class queue_LL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node rear;

    public static boolean isEmpty(){
        return head== null && rear ==null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(rear==null){
            rear = head = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int front = head.data;
        if(head==rear){
            rear=null;
        }
        head = head.next;

        return front;
    }

    public int peek(){
        if(isEmpty()){
            return-1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        queue_LL ql = new queue_LL();
        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(4);
        ql.add(5);

        System.out.println(ql.peek());

        ql.dequeue();
        System.out.println(ql.peek());

    }
}
