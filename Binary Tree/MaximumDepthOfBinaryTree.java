// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    public int maxDepthUsingLevelOrderTraversal(TreeNode root) {
        int depth=0;
        if(root==null)
            return depth;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int cnt=0;
            while(cnt !=size){
                TreeNode temp=q.remove();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                cnt++;
            }
            depth++;
        }
        return depth;
    }   
    public int  maxDepthUsingRecursion(TreeNode root){
        if(root==null)
            return 0;

        int lh=maxDepthUsingRecursion(root.left);
        int rh=maxDepthUsingRecursion(root.right);

        return 1+Math.max(lh,rh);
    }
}
