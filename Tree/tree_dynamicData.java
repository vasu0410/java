
import java.util.*;
public class tree_dynamicData {
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
    private void list_add_tree(){
        Queue <Node> que = new LinkedList<Node>();
        que.add(root);
        que.add(null);
        
        List<List<Integer>> Tree = new ArrayList<>();
        List<Integer> currtLvl = new ArrayList<>();

        while(!que.isEmpty()){
        Node tmp = que.poll();

        if(tmp!=null){
            currtLvl.add(tmp.data);

            if(tmp.leftnode!=null)
            que.add(tmp.leftnode);

            if(tmp.rightnode!=null)
            que.add(tmp.rightnode);
        }
        else{
            List<Integer> temp = new ArrayList<>(currtLvl);
            currtLvl.clear();
            Tree.add(temp);
            if(!que.isEmpty()){
                que.add(null);
            }
        }
    }
        System.out.println(Tree);
    }
    private void print_tree_lvl(){
        Queue <Node> que = new LinkedList<Node>();
        que.add(root);
        que.add(null);
        
        while(!que.isEmpty()){
            Node tmp = que.poll();

            if(tmp !=null){
                System.out.print(tmp.data +" ");
                if(tmp.leftnode!=null)
                que.add(tmp.leftnode);

                if(tmp.rightnode!=null)
                que.add(tmp.rightnode);
            }

            else{
                System.out.println();
                if(!que.isEmpty()){
                    que.add(null);
                }
            }
        }
    }
    private void display_tree(){
        
        Queue <Node> que = new LinkedList<Node>();
        que.add(root);

        while(!que.isEmpty()){
            Node tmp = que.poll();
            System.out.print(tmp.data+" ");

            if(tmp.leftnode!=null){
                que.add(tmp.leftnode);
            }

            if(tmp.rightnode!=null){
                que.add(tmp.rightnode);
            }

            
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
    public static void main(String[] args) {
        tree_dynamicData t = new tree_dynamicData();
        for(int i=0;i<10;i++){
            t.insert_tree(i);
        }
        // t.display_tree();
        // t.print_tree_lvl();
        t.list_add_tree();
        // System.out.println("success");

    }
}
