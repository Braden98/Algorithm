package Sort;
import sun.misc.Unsafe;

public class shellSort{
    public static void shellSort(int[] arr){
        if(arr == null || arr.length <= 2){
            return ;
        }
        int len = arr.length;
        int gap = 1;
        while(gap<len/3){
            gap = gap*3 + 1;
        }
        while(gap > 1){
            for(int i = gap; i<len;i++){
                for(int j = i;j>=h&&arr[j-gap]>arr[j];j-=gap){
                    swap(arr,arr[j-gap],arr[j]);
                }
            }
            gap/=3;
        }
    }
    public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}