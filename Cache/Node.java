package Algorithm.Cache;

/**
 * @Description 节点
 * @Author ubique
 * @Date 2019/5/21 10:43 PM
 */

public class Node<V> {
    public V value;
    public Node<V> last;
    public Node<V> next;

    public Node(V value) {
        this.value = value;
    }
}