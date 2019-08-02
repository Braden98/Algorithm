package Algorithm.Binarytree;

import javax.swing.tree.TreeNode;

/**
 * @Description 二叉树的最小深度
 * @Author ubique
 * @Date 2019/8/2 10:38 PM
 */

public class minDepth {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.right == null && root.left == null)
            return 1;
        if(root.right != null && root.left != null)
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        if(root.left == null)
            return minDepth(root.right)+1;
        if(root.right == null)
            return  minDepth(root.left)+1;
        return 0;
    }
}
