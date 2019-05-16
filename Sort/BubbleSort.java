package Algorithm.Sort;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/16 10:27 AM
 */

public class BubbleSort {
    public static void bubbleSort(int[] list){
        for(int k=1;k<list.length;k++){
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    Tools.swap(list,i,i+1);
                }
            }
        }
    }
}
