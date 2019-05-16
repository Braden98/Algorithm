package Algorithm.Sort;

/**
 * @Description 相比之前的排序提高条件:元素不再可以是任何可比较对象，而只能是整数，
 * 可以用桶排序，不再用比较 Value
 * @Author ubique
 * @Date 2019/5/16 1:36 PM
 */

public class BucketSort {
    // only for 0~200 value
    public static void bucketSort(int[] list) {
        if (list == null || list.length < 2) {
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            max = Math.max(max, list[i]);
        }
        int[] bucket = new int[max + 1];
        for (int i = 0; i < list.length; i++) {
            bucket[list[i]]++;
        }
        int i = 0;
        for (int j = 0; j < bucket.length; j++) {
            while (bucket[j]-- > 0) {
                list[i++] = j;
            }
        }
    }
}
