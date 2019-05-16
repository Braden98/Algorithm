package Algorithm.Sort;

/**
 * @Description 归并排序是一种递归排序算法，它首先将数组分为两部分，随后每部分排好序后再进行归并。
 * 递归停止的条件是数组长度小于2，此时相当于两个数比较大小。
 * @Author ubique
 * @Date 2019/5/16 10:51 AM
 */

public class MergeSort {
    public static void mergeSort(int[] list) {
        //数组为空或长度不足以再分 则直接返回
        if (list == null || list.length < 2) {
            return;
        }
        mergeSort(list, 0, list.length - 1);
    }
    /**
     * @Description:  递归的方法
     * @Param: [list: 传入的整个数组,
     * l: 要排序的子数组的起始部分,
     * r: 要排序的子数组的结束部分]
     * @Return: void
     * @Date: 2019/5/16 11:13 AM
     * @Author: Ubique
     */
    public static void mergeSort(int[] list, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        mergeSort(list, l, mid);
        mergeSort(list, mid + 1, r);
        merge(list, l, mid, r);
    }
    /**
     * @Description: 归并函数
     * @Param: [list: 传入的整个数组,
     * l: 待归并的数组1的起点,
     * m: 待归并的数组1的终点，待归并的数组2的起点,
     * r: 待归并的数组2的终点]
     * @Return: void
     * @Date: 2019/5/16 11:15 AM
     * @Author: Ubique
     */
    public static void merge(int[] list, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        while (p1 <= m && p2 <= r) {
            help[i++] = list[p1] < list[p2] ? list[p1++] : list[p2++];
        }
        while (p1 <= m) {
            help[i++] = list[p1++];
        }
        while (p2 <= r) {
            help[i++] = list[p2++];
        }
        for (i = 0; i < help.length; i++) {
            list[l + i] = help[i];
        }
    }

}
