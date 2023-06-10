
import java.util.*;
public class TreeLevelRecurse {
    static Node root;
    class Node{
        Node leftnode;
        int data;
        Node rightnode;

        Node(int data){
            this.data = data;
            leftnode = rightnode = null;
        }
    }
    private void insert_tree(int data){
        
        Node newNode = new Node(data);
        if(root==null){
            root = newNode;
            return;
        }
        
        
        Queue <Node> que = new LinkedList<Node>();
        que.add(root);
        while(!que.isEmpty()){
            Node tmp = que.poll();

            if(tmp.leftnode==null){
                tmp.leftnode=newNode;
                break;
            }
            else{
                que.add(tmp.leftnode);
            }
            
            if(tmp.rightnode==null){
                tmp.rightnode = newNode;
                break;
            }
            else{
                que.add(tmp.rightnode);            }
        }
    }
    private int height(Node root){
        if(root==null)
            return 0;
        
            int a = height(root.leftnode);
            int b = height(root.rightnode);

            return Math.max(a,b)+1;

    }
    private void printTreeLevelRecurse(){
        int hight_tree = height(root);
    }
    public static void main(String[] args) {
       TreeLevelRecurse t = new TreeLevelRecurse();
        for(int i=0;i<10;i++){
            t.insert_tree(i);
        }
        // t.height(root);
        // System.out.println(t.height(root));
        t.printTreeLevelRecurse();
    }
}
