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
class PreOrderTraversal{
    ArrayList<Integer> list=new ArrayList<>();
    void preOrder(TreeNode root){
        if(root==null)
            return;
        list.add(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public ArrayList<Integer> preorderTraversal(TreeNode root) {

        preOrder(root);
        return list;
    }
}