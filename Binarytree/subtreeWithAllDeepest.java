package Algorithm.Binarytree;

import javax.swing.tree.TreeNode;

/**
 * @Description
 * @Author ubique
 * @Date 2019/7/30 10:44 PM
 */

public class subtreeWithAllDeepest {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null)
            return null;
        else {
            int ldep=maxDepth(root.left),rdep=maxDepth(root.right);
            if(ldep==rdep)
                return root;
            else if(ldep>rdep)
                return subtreeWithAllDeepest(root.left);
            else
                return subtreeWithAllDeepest(root.right);
        }
    }
    int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else
            return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
