import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Pair{
    TreeNode node;
    int count;
    public Pair(TreeNode node,int count){
        this.node=node;
        this.count=count;
    }
}

public class PreorderInorderPostorderTraversalInOneTraversal {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        ArrayList<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> pre=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<>();
        ArrayList<Integer> post=new ArrayList<>();
        Stack<Pair> s=new Stack<>();
        s.push(new Pair(root,1));
        while(!s.isEmpty()){
            Pair temp=s.pop();
            if(temp.count==1){
                pre.add(temp.node.data);
                temp.count++;
                s.push(temp);

                if(temp.node.left !=null)
                    s.push(new Pair(temp.node.left,1));

            }else if(temp.count==2){
                in.add(temp.node.data);
                temp.count++;
                s.push(temp);

                if(temp.node.right !=null)
                    s.push(new Pair(temp.node.right,1));
            }else{
                post.add(temp.node.data);
            }
        }
        list.add(in);
        list.add(pre);
        list.add(post);

        return list;
    
    }
}
