import java.util.*;
public class tree_rigth_view {
   
    Node rootNode;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    private void insert(int data){
        Node newNode = new Node(data);

        if(rootNode == null){
            rootNode = newNode;
            return;
        }

        Queue <Node> que = new LinkedList<Node>();
        que.add(rootNode);

        while(!que.isEmpty()){
            Node tmp = que.poll();

            if(tmp.left==null){
                tmp.left = newNode;
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
    private void right_view(Node curr,int level,List<Integer> rightview){

        if(curr==null){
            return;
        }
        System.out.println("level "+level+" size "+rightview.size()+" val "+curr.data);
        if(level==rightview.size()){
            rightview.add(curr.data);
        }

        right_view(curr.right,level+1,rightview);
        right_view(curr.left,level+1,rightview);

    }
    public static void main(String[] args) {
        tree_rigth_view tr = new tree_rigth_view();
        
        tr.insert(10);
        tr.insert(20);
        tr.insert(30);
        tr.insert(40);
        tr.insert(60);

        List<Integer> rightview = new ArrayList<>();

        tr.right_view(tr.rootNode, 0, rightview);

        System.out.println(rightview);
    }
}
