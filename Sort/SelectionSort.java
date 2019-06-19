package Algorithm.Sort;

/**
 * @Description 选择排序，每次通过遍历选择未排序部分的最值，移动到已排序部分的末尾
 * @Author ubique
 * @Date 2019/6/4 6:22 PM
 */

public class SelectionSort {
    public static void selectionSort(int[] list){
        int minindex=-1;
        for(int i=0;i<list.length;i++){
            minindex = i;
            for(int j=i+1;j<list.length;j++){
                if(list[minindex]>=list[j]){
                    minindex = j;
                }
            }
            Tools.swap(list,i,minindex);
        }
    }
}
