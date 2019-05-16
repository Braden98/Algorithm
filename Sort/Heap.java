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

        }
    }
    public void add(E newObject){

    }
    public E remove(){

    }

    public int getSize(){
        return list.size();
    }
}
