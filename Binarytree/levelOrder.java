package Algorithm.Binarytree;

//import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author ubique
 * @Date 2019/8/1 10:51 PM
 */

public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //注意这里的声明方式
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if (root == null)
            return ans;
        // 这里不能直接返回null，原因是输入的是[]，输出的是null（本应为[]，不一致
        process(root,0,ans);
        return ans;
    }


    private void process(TreeNode root,int level, List<List<Integer>> ans){
        // 取下标前先确认长度，这里也可用.size()代替 .get(level)
        if(ans.size() == level)
            ans.add(new ArrayList<Integer>());

        ans.get(level).add(root.val);

        if(root.left != null)
            process(root.left,level+1,ans);
        if(root.right != null)
            process(root.right,level+1,ans);

    }
    private void process(Node root,int level, List<List<Integer>> ans){
        // 取下标前先确认长度，这里也可用.size()代替 .get(level)
        if(ans.size() == level)
            ans.add(new ArrayList<Integer>());

        ans.get(level).add(root.val);
        for(int i=0;i<root.children.size();i++)
            if(root.children.get(i) != null)
                process(root.children.get(i),level+1,ans);
    }
}
