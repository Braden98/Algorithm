package Algorithm.Sort;


/**
 * @Description 插入排序
 * 方法是在原有数组内维护一个从某端为起点长度不断增加的子数组并最终取代原来的数组，
 * 维护的方法是不断从未排序数组中取元素并插入有序子数组中，
 * 本例中 插入的方式是不断从后往前找到第一个比待插入数字小的数并插在这个数字之后，
 * 同时其他数字向后移动。
 * @Author ubique
 * @Date 2019/5/16 10:00 AM
 */

public class InsertionSort {
    public static void insertionSort(int[] list){
        for(int  i=1;i<list.length;i++){
            int  cur=list[i];
            int  k;
            for(k=i-1;k>=0&&list[k]>cur;k--){
                list[k+1]=list[k];
            }
            list[k+1]=cur;
        }
    }
}
