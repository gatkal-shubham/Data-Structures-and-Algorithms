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
public class DiameterofBinaryTree {
    int max=0;
    int findHeight(TreeNode root){
        if(root==null)
            return 0;
        int lh=findHeight(root.left);
        int rh=findHeight(root.right);
        max=Math.max(max,lh+rh);
        return 1+Math.max(lh,rh);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return max;

    }
}
