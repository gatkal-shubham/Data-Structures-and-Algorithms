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

public class PostOrderTraversal {
    ArrayList<Integer> list=new ArrayList<>();
    void post(TreeNode root){
        if(root==null)
            return ;
        post(root.left);
        post(root.right);
        list.add(root.data);

    }
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        post(root);
        return list;
    }
}
