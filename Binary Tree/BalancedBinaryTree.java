// Given a binary tree, determine if it is height-balanced.
// A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
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
public class BalancedBinaryTree {
    int maxDepth(TreeNode root){
        if(root==null)  
            return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        if(lh ==-1 || rh== -1 ) return -1;
        if(Math.abs(lh-rh)>1) return -1;

        return 1+ Math.max(lh,rh);
    }
    boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int depth=maxDepth(root);
        if(depth==-1)
            return false;
        return true;
    }
}
