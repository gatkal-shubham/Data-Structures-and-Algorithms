import java.util.ArrayList;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class InOrderTraversal {
    ArrayList<Integer> list=new ArrayList<>();
    void inOrder(TreeNode root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }
}
