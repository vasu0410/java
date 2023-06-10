import java.util.*;
public class bst_insert {
    TreeNode rootNode;

    static class TreeNode{
        int data;
        TreeNode leftChild;
        TreeNode rightChild;
        TreeNode(int data){
            this.data = data;
            leftChild = rightChild = null;
        }
    }
    private TreeNode insertNode(TreeNode root,int data) {
        if(root == null) {
            root = new TreeNode(data);
        }
        else{
            if(data <= root.data) {
                root.leftChild = insertNode(root.leftChild, data);
            }
            else {
                root.rightChild = insertNode(root.rightChild, data);
            }
        }   
        return root;

        
    }
    private void preorder(TreeNode root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.leftChild);
        preorder(root.rightChild);
    }
    public static void main (String[] args) {
                      // Your code here
                   Scanner scanner = new Scanner(System.in);
                    int n = scanner.nextInt();
                
                    bst_insert main = new bst_insert();
                
                    for(int i=0;i<n;i++){
                        main.rootNode = main.insertNode(main.rootNode,i);
                    }
                        
                   
                    main.preorder(main.rootNode);
                    // System.out.print(main.maxSumBST(main.rootNode));
    }
}
