package Algorithm.Array;

/**
 * @Description 0,1,2排序等问题
 * @Author ubique
 * @Date 2019/7/6 10:45 PM
 */

public class PartitionArray {
    public static void leftUnique(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int u = 0;
        int i = 1;
        while (i != arr.length) {
            if (arr[i++] != arr[u]) {
                swap(arr, ++u, i - 1);
            }
        }
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int left = -1;
        int index = 0;
        int right = arr.length;
        while (index < right) {
            if (arr[index] == 0) {
                swap(arr, ++left, index++);
            } else if (arr[index] == 2) {
                swap(arr, index, --right);
            } else {
                index++;
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i != arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
