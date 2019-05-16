package Algorithm.Sort;

/**
 * @Description 堆排序，在设计好堆这个数据结构后，就很简单啦。用 add() 方法依次添加元素
 * 建立堆，然后用 remove() 方法从堆中降序删除元素从而得到升序数组(反之）
 * @Author ubique
 * @Date 2019/5/16 11:56 AM
 */

public class HeapSort {
    public static <E extends Comparable<E>> void heapSort(E[] list){
        Heap<E> heap=new Heap<>();
        for (E object:list) {
            heap.add(object);
        }
        //for(E object:heap)
        for(int i=list.length-1;i>=0;i--){
            list[i]=heap.remove();
        }
    }
}
