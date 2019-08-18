链接：https://www.nowcoder.com/questionTerminal/b31734e46ba644de85a9cf95bbd57a5f?f=discussion
来源：牛客网

import java.util.*;
 
class STNode {
    int val;
    int sum;
    STNode left = null;
    STNode right = null;
 
    public STNode(int val) {
        this.val = val;
    }
}
 
public class Main {
    static int[] preOrder;
    static int[] inOrder;
    static List<Integer> ans;    //存和的中序遍历。
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        int len = str1.length;
        preOrder = new int[len];
        inOrder = new int[len];
        for (int i = 0; i < len; i++) {
            preOrder[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < len; i++) {
            inOrder[i] = Integer.parseInt(str2[i]);
        }
        STNode sroot = creatTree(0, 0, len - 1);
        sumNode(sroot);
        ans = new ArrayList<>();
        inOrderGo(sroot);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
     
    //根据先序和中序遍历构建二叉树。
    static STNode creatTree(int root, int beg, int end) {
        if (beg > end) return null;
        STNode node = new STNode(preOrder[root]);
        int loc = 0;
        int cnt = 0;
        for (loc = beg; loc <= end; loc++) {
            cnt++;
            if (preOrder[root] == inOrder[loc])
                break;
        }
        node.left = creatTree(root + 1, beg, loc - 1);
        node.right = creatTree(root + cnt, loc + 1, end);
        return node;
    }
 
    //更新sum值。
    static void sumNode(STNode node) {
        if (node.left == null && node.right == null) {
            node.sum = 0;
        } else if (node.left == null) {
            sumNode(node.right);
            node.sum = node.right.sum + node.right.val;
        } else if (node.right == null) {
            sumNode(node.left);
            node.sum = node.left.sum + node.left.val;
        } else {
            sumNode(node.left);
            sumNode(node.right);
            node.sum = node.left.sum + node.left.val + node.right.sum + node.right.val;
        }
    }
 
     //中序遍历。
    static void inOrderGo(STNode node) {
        if (node == null) return;
        inOrderGo(node.left);
        ans.add(node.sum);
        inOrderGo(node.right);
    }
 
}
 
    
