package Algorithm.Binarytree;

/**
 * @Description 最大子树
 * @Author ubique
 * @Date 2019/5/22 10:44 PM
 */

public class BiggestSubBSTInTree {
    public static Node getMaxBST(Node head) {
        return process(head).maxBSTHead;
    }

    public static class ReturnType {
        public Node maxBSTHead;
        public int maxBSTSize;
        public int min;
        public int max;

        public ReturnType(Node maxBSTHead, int maxBSTSize, int min, int max) {
            this.maxBSTHead = maxBSTHead;
            this.maxBSTSize = maxBSTSize;
            this.min = min;
            this.max = max;
        }
    }

    public static ReturnType process(Node X) {
        // base case : 如果子树是空树
        // 最小值为系统最大
        // 最大值为系统最小
        if (X == null) {
            return new ReturnType(null, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        // 默认直接得到左树全部信息
        ReturnType lData = process(X.left);
        // 默认直接得到右树全部信息
        ReturnType rData = process(X.right);
        // 以下过程为信息整合
        // 同时以X为头的子树也做同样的要求，也需要返回如ReturnType描述的全部信息
        // 以X为头的子树的最小值是：左树最小、右树最小、X的值，三者中最小的
        int min = Math.min(X.value, Math.min(lData.min, rData.min));
        // 以X为头的子树的最大值是：左树最大、右树最大、X的值，三者中最大的
        int max = Math.max(X.value, Math.max(lData.max, rData.max));
        // 如果只考虑可能性一和可能性二，以X为头的子树的最大搜索二叉树大小
        int maxBSTSize = Math.max(lData.maxBSTSize, rData.maxBSTSize);
        // 如果只考虑可能性一和可能性二，以X为头的子树的最大搜索二叉树头节点
        Node maxBSTHead = lData.maxBSTSize >= rData.maxBSTSize ? lData.maxBSTHead
                : rData.maxBSTHead;
        // 利用收集的信息，可以判断是否存在可能性三
        if (lData.maxBSTHead == X.left && rData.maxBSTHead == X.right
                && X.value > lData.max && X.value < rData.min) {
            maxBSTSize = lData.maxBSTSize + rData.maxBSTSize + 1;
            maxBSTHead = X;
        }
        // 信息全部搞定，返回
        return new ReturnType(maxBSTHead, maxBSTSize, min, max);
    }

    // for test -- print tree
    public static void printTree(Node head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(Node head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.value + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }

}
