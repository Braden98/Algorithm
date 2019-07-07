package Algorithm.stack;

import java.util.Stack;

/**
 * @Description stack排序
 * @Author ubique
 * @Date 2019/7/7 10:34 PM
 */

public class StackSortStack {
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
