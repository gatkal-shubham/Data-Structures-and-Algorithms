import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class LevelOrderTraversal {
     public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root !=null) q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> subList=new ArrayList<>();
            int cnt=0;
            while(cnt !=size){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                subList.add(q.poll().data);
                cnt++;
            }
            list.add(subList);
        }
        return list;
    }
}
