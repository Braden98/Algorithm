package Algorithm.Sort;

/**
 * @Description （二叉）堆的设计与实现
 * 堆是一棵完全二叉树，且每个节点大于其任意一个孩子，故其增删效率高
 * 堆在内部由 数组线性表 实现，也可以改为其他数据结构，上述规约不变即可
 * @Author ubique
 * @Date 2019/5/16 11:44 AM
 */

public class Heap <E extends Comparable<E>> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    public Heap(){
    }

    public Heap(E[] objects){
        for(int i=0;i<objects.length;i++){
            add(objects[i]);
        }
    }

    public void add(E newObject) {
        list.add(newObject);
        int cur = list.size() - 1;

        while (cur > 0) {
            //得到父节点在数组线性表中的 Index
            int parentIndex = (cur - 1) / 2;
            //如果子节点比父节点大，就交换
            if (list.get(cur).compareTo(
                    list.get(parentIndex)) > 0) {
                E temp = list.get(cur);
                list.set(cur, list.get(parentIndex));
                list.set(parentIndex, temp)
            } else {
                break;
            }
            cur = parentIndex;
        }
    }
    public E remove(){
        if(list.size()==0){
            return null;
        }

        E removeObject = list.get(0);
        //数组的配套操作，最后一个元素调到首位，然后开始调整二叉树成 Heap
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);

        int cur=0;
        while (cur<list.size()){
            int leftChildIndex = 2*cur+1;
            int rightChildIndex = 2*cur+2;

            if(leftChildIndex>=list.size()){
                //此时已经是 Heap
                break;
            }
            int  maxIndex=leftChildIndex;
            if(rightChildIndex<list.size()){
                if(list.get(maxIndex).compareTo(
                        list.get(rightChildIndex))<0){
                    maxIndex=rightChildIndex;
                }
            }

            if(list.get(cur).compareTo(list.get(maxIndex))<0){
                E temp = list.get(maxIndex);

                list.set(maxIndex,list.get(cur));
                list.set(cur,temp);
                cur=maxIndex;
            }
            else {
                break;
            }
        }

        return removeObject;
    }

    public int getSize(){
        return list.size();
    }
}
