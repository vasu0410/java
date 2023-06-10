import java.util.*;
class dsa3_prb{
    static Node rootNode;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=right=null;
        }
    }
private static void insert(int data){
    Node newNode = new Node(data);
    if(rootNode==null){
        rootNode = newNode;
        return;
    }
    Queue<Node> que = new LinkedList<>();

    que.add(rootNode);
    while(!que.isEmpty()){
        Node temp = que.poll(); // 1

        if(temp.left==null){        
            temp.left = newNode;
            break;
        }
        else{
            que.add(temp.left);
        }

        if(temp.right==null){
            temp.right = newNode;
            break;
        }
        else{
            que.add(temp.right);
        }
    }
}    
private static void display(){
    if(rootNode==null){
        return;
    }
    Queue<Node> que = new LinkedList<>();
    que.add(rootNode);
    while(!que.isEmpty()){
        Node temp = que.poll();
        System.out.print(temp.data+" ");


        if(temp.left!=null && temp.left.data!=-1){
            que.add(temp.left);
        }
        if(temp.right!=null && temp.right.data!=-1){
            que.add(temp.right);
        }
    }

}
static int diameter = 0;
private static int diameter(Node root){
    int height = 0;
    if(root!=null){
        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);

        height = Math.max(leftHeight,rightHeight)+1;
        diameter = Math.max(diameter,leftHeight+rightHeight);
    }
    return height;
}
public static void main(String[] args) {
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    insert(5);
    // display();
    diameter(rootNode);
    System.out.println(diameter);
}
}