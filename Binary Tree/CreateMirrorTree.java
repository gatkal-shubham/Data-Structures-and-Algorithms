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
public class CreateMirrorTree {
    void mirror(TreeNode root) {
        // Your code here
        if(root==null)
            return ;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
}
