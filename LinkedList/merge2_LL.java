import java.util.*;

public class merge2_LL {
    Node head;
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        
        curr.next = newNode;
        
    }
     
    public static void main(String[] args) {
        merge2_LL list = new merge2_LL();
        merge2_LL list2 = new merge2_LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        
        list2.addLast(4);
        list2.addLast(6);
        list2.addLast(7);
        list2.addLast(8);

        
        Node temp;
        Node dummy = list.new Node(0);
        dummy.next = list.head;

            Node curr = list.head;
        while(curr.next!=null){
            if(curr.next.data<=list2.head.data){
                System.out.println("curr1 " +curr.data);
                curr = curr.next;
                System.out.println("curr2 "+curr.data);
            }
            else{
                
                temp = curr.next;
                curr.next = list.head;
                curr.next.next = temp;
            }
        }
        while(list.head!=null){
            curr.next = list.head;
            list.head = list.head.next;
            curr = curr.next;
        }
        while(list.head.next!=null){
            System.out.println(list.head.data);
            list.head = list.head.next;
        }
    }
}
