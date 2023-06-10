
public class reverse_LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public void insert(int data){
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
    public void display(){
        if(head==null){
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }

    }
    public void reverse(){
        
        if(head==null || head.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;

       while(curr!=null){
            Node nextt = curr.next;    
            curr.next = prev;
            prev = curr;  
            curr = nextt;
           
       }
       head.next = null;
       head = prev;
       
    }
    // Enter at n position
    public void n_th(int data,int size){
        if(head==null){
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        int count = 1;
        while(curr.next!=null){
           
            if(count==size){
               Node tmp = curr.next; //2
               curr.next = newNode; //3
               curr.next.next = tmp;
            }
            curr = curr.next;
            count++;
        }
        
    }
    //remove using val
    public void n_th_delete(int data){
        if(head==null){
            return;
        }
        Node tmp = head;
        while(tmp.next.data!=data && tmp.next!=null){
            tmp = tmp.next;  // before val  
        }
        tmp.next = tmp.next.next; // skip next node

    }
    public static void main(String[] args) {
        reverse_LL r = new reverse_LL();

        r.insert(1);
        r.insert(2);
        r.insert(3);
        r.insert(4);
        r.insert(6);

        System.out.println("Before reverse ");
        r.display();

        System.out.println("After reverse ");
        r.n_th_delete(4);
        r.display();
    }
}
