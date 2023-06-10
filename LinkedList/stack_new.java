
public class stack_new {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        stack_new stack = new stack_new();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());

        while(stack.isEmpty()==false){
            System.out.println(stack.pop());
        }

    }
}
