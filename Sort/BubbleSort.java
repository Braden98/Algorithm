package Algorithm.Sort;

/**
 * @Description  冒泡排序算法多次遍历数组，在每次遍历中，如果没有按照顺序排序，
 * 就交换两个数的位置。正如其名，每次排序会有最大或最小的数字到某端（这里一律按照从头到尾
 * 升序排序 ），从而遍历数组长度减去1。
 * 注意到当某次排序后 已经有序，则不必剩下的任何操作，故设置变量 needNextPass 来优化性能。
 * @Author ubique
 * @Date 2019/5/16 10:27 AM
 */

public class BubbleSort {
    public static void bubbleSort(int[] list){
        boolean needNextPass=true;
        for(int k=1;k<list.length&&needNextPass;k++){
            needNextPass=false;
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    Tools.swap(list,i,i+1);
                    needNextPass=true;
                }
            }
        }
    }
}
