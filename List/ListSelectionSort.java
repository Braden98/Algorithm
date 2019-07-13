package Algorithm.List;

/**
 * @Description 链表的选择排序
 * @Author ubique
 * @Date 2019/7/13 10:48 PM
 */

public class ListSelectionSort {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node selectionSort(Node head) {
        Node tail = null; // sorted part tail
        Node cur = head; // unsorted part head
        Node smallPre = null; // previous node of the smallest node
        Node small = null; // smallest node
        while (cur != null) {
            small = cur;
            smallPre = getSmallestPreNode(cur);
            if (smallPre != null) {
                small = smallPre.next;
                smallPre.next = small.next;
            }
            cur = cur == small ? cur.next : cur;
            if (tail == null) {
                head = small;
            } else {
                tail.next = small;
            }
            tail = small;
        }
        return head;
    }

    public static Node getSmallestPreNode(Node head) {
        Node smallPre = null;
        Node small = head;
        Node pre = head;
        Node cur = head.next;
        while (cur != null) {
            if (cur.value < small.value) {
                smallPre = pre;
                small = cur;
            }
            pre = cur;
            cur = cur.next;
        }
        return smallPre;
    }


}
