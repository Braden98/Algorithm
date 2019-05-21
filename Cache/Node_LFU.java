package Algorithm.Cache;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/21 10:45 PM
 */

public class Node_LFU {
        public Integer key;
        public Integer value;
        // 这个节点发生get或者set的次数总和
        public Integer times;
        //节点之间是双向链表所以有上一个节点
        public Node up;
        //节点之间是双向链表所以有下一个节点
        public Node down;

        public Node_LFU(int key, int value, int times) {
            this.key = key;
            this.value = value;
            this.times = times;
        }
}
