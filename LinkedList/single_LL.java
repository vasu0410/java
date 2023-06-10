import java.util.*;

public class single_LL {
    Node head;
    private int size =0;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
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
    public void disp(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node curr = head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }
    public void deleteLast(){
        if(head==null || head.next==null){
            head = null;
            return;
        }
        Node s_last = head;
        Node l_list = head.next;

        while(l_list.next!=null){
            l_list = l_list.next;
            s_last = s_last.next;
        }
        s_last.next = null;
    }

    public void delete_n(int x){
        if(head == null){
            return;
        }
        Node tmp = head;
        while(tmp.data!=x && tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = null;
            
            
    }

    public static void main(String[] args) {
        single_LL ll = new single_LL();
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(5);

        ll.delete_n(5);
        
        
        ll.disp();

    }
}
