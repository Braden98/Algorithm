package Sort;

public class MergeSort{
    public static void mergeSort(int[] arr){
        if(arr == null || arr.length < 2)
            return ;

        mergeSort(arr,0,arr.length-1);
    }
    
    public static void mergeSort(int[] arr,int l,int r){
        if(l == r)
            return;
        int m =l + (r - l)>>>1;
        mergeSort(arr,l,m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
    }
    public static void merge(int[] arr,int l,int m,int r){
       int[] help = new int[r-l+1];

       int i = 0;
       int p1 =l;
       int p2 = m+1;

       while(p1<=m&&p2<=r){
           help[i++] = arr[p1]>arr[p2] ? arr[p1++]:arr[p2++];
       }
       while(p1<=m){
           help[i++]=arr[p1++];
       }
       while(p2<=r){
           help[i++]=arr[p2++];
       }
       for(int k = 0;k<help.length;k++){
           arr[l+k] = help[k];
       }
   }
}