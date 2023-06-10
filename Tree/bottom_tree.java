import java.util.*;
public class bottom_tree {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right =null;
        }
    }
    static class Pair{
        int levelnumber;
        Node currNode;

        Pair(int levelnumber,Node currNode){
            this.levelnumber = levelnumber;
            this.currNode = currNode;
        }
    }
    public void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void addTree(int data){
        if(root==null){
            root = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();

            if(temp.left==null){
                temp.left = newNode;
                break;
            }
            else{
                q.add(temp.left);
            }
            if(temp.right==null){
                temp.right = newNode;
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }
    public List<Integer> bottom_view(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root!=null){
            Map<Integer,Integer> levelmap = new TreeMap<>();
            Queue<Pair> queue = new LinkedList<>();

            queue.add(new Pair(0,root));

            while(!queue.isEmpty()){
                Pair currPair = queue.poll();
                int levelnumber = currPair.levelnumber;
                Node currNode = currPair.currNode;

                levelmap.put(levelnumber,currNode.data);
                if(currNode.left!=null){
                    queue.add(new Pair(levelnumber-1, currNode.left));
                }

                if(currNode.right!=null){
                    queue.add(new Pair(levelnumber+1, currNode.right));
                }
            }
            System.out.println(levelmap);
            for(Map.Entry<Integer,Integer> entry : levelmap.entrySet()){
                ans.add(entry.getValue());
            }
        }

    }
    public static void main(String[] args) {
        bottom_tree tree = new bottom_tree();
        tree.addTree(1);
        tree.addTree(2);
        tree.addTree(3);
        // tree.preorder(tree.root);
        tree.bottom_view(tree.root);
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
    }
}
