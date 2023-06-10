import java.util.*;
public class MaxWidth_tree {
    static class Node{
        int data;
        Node right,left;

        Node(int data){
            this.data = data;
            left = right =null;
        }
    }
    Node rootNode;
    public void insert_tree(int data){
        Node newNode = new Node(data);
        
        if(rootNode == null){
            rootNode = newNode;
            return;
        }

        Queue <Node> que = new LinkedList<>();
       
        que.add(rootNode);
        while(!que.isEmpty()){
           
            Node tmp = que.poll();
            
          
            if(tmp.left==null){
                tmp.left=newNode;
                break;
            }
            else{
                que.add(tmp.left);
            }

            if(tmp.right==null){
                tmp.right = newNode;
                break;
            }
            else{
                que.add(tmp.right);
            }
        }
        
    }
    public void levelOrderTree(){
        if(rootNode==null){
            return;
        }
        int maxWidth=1;
        int count =0;
        Queue<Node> que = new LinkedList<>();
        que.add(rootNode);
        que.add(null);
        
        while(!que.isEmpty()){
            
            Node tmp = que.poll();
    
            if(tmp!=null){
                System.out.print(tmp.data+" ");
              
                if(tmp.left!=null){

                    que.add(tmp.left);
                    count++;
                }
            
                if(tmp.right!=null){
                    que.add(tmp.right);
                    count++;
                }


            }
            else{
                maxWidth = Math.max(maxWidth,count);
                count = 0;
                System.out.println();
                if(!que.isEmpty()){
                    que.add(null);
                }
            }
        }
        System.out.println(maxWidth);
        
    }
    public static void main(String[] args) {
        
        MaxWidth_tree tree = new MaxWidth_tree();
        tree.insert_tree(1);
        tree.insert_tree(3);
        tree.insert_tree(2);
        tree.insert_tree(5);
        tree.insert_tree(-1);
        tree.insert_tree(-1);
        tree.insert_tree(9);
        tree.insert_tree(6);
        tree.insert_tree(-1);
        tree.insert_tree(7);


        tree.levelOrderTree();
        

    }
}
