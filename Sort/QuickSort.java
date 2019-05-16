package Algorithm.Sort;

import static Algorithm.Sort.Tools.swap;

/**
 * @Description 快速排序 在数组中选择一个基准 pivot ,将元素按照与 pivot 的大小(Comparable)
 * 关系划分到 pivot 的前边和后边。递归地对划分后的脸前后两部分使用快速排序，最终得到有序数组
 * @Author ubique
 * @Date 2019/5/16 11:19 AM
 */

public class QuickSort {
    public static void quickSort(int[] list) {
        if (list == null || list.length < 2) {
            return;
        }
        quickSort(list, 0, list.length - 1);
    }
    public static void quickSort(int[] list, int l, int r) {
        if (l < r) {
            //通过随机划分避免极端情况下时间复杂度提升到O(n^2)
            //swap(list, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p = partition(list, l, r);
            quickSort(list, l, p[0] - 1);
            quickSort(list, p[1] + 1, r);
        }
    }
    /**
     * @Description: 划分方法
     * @Param: [list, l, r]
     * @Return: int[]
     * @Date: 2019/5/16 11:28 AM
     * @Author: Ubique
     */
    public static int[] partition(int[] list, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (list[l] < list[r]) {
                swap(list, ++less, l++);
            } else if (list[l] > list[r]) {
                swap(list, --more, l);
            } else {
                l++;
            }
        }
        swap(list, more, r);
        return new int[] { less + 1, more };
    }
}
