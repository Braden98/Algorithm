package Algorithm.Sort;


/**
 * @Description 插入排序
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
