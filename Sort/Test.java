package Algorithm.Sort;

import java.util.Random;

/**
 * @Description
 * @Author ubique
 * @Date 2019/6/4 6:27 PM
 */

public class Test {
    public static void main(String[] args) {
        int[] array = new int[30];
        Random random = new Random();
        for(int i=0;i<array.length;i++){
            array[i] = i+22;
        }
        SelectionSort.selectionSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
