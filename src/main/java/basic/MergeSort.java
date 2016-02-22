package basic;

import util.PrintUtil;

/**
 * sort array using merge sort
 * Created by wuwenjie on 2/22/16.
 */
public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array == null) {
            return ;
        }

        int[] temp = new int[array.length];
        helper(array, 0, array.length - 1, temp);
    }

    public static void helper(int[] array, int start, int end, int[] temp) {
        System.out.println("here" + start + ", " + end);

        // 分治的结果, 是把目标数量限制在2及以内,如果在2以内,可以使用if直接得到结果
        if (start == end) {
            return ;
        }

        if (start + 1 == end) {
            if (array[start] > array[end]) {
                int tmp = array[end];
                array[end] = array[start];
                array[start] = tmp;
            }
            return ;
        }

        // 真正的分治
        int mid = start + (end - start) / 2;
        if (start < end - 1) {

            helper(array, start, mid, temp);
            helper(array, mid + 1, end, temp);
            merge(array, start, mid, mid + 1, end, temp);
        }
    }

    private static void merge(int[] array, int start1, int end1, int start2, int end2, int[] temp) {
        int counter = 0;
        int start = start1;
        while (start1 <= end1 && start2 <= end2) {
            if (array[start1] < array[start2]) {
                temp[start + counter] = array[start1];
                start1++;
            } else {
                temp[start + counter] = array[start2];
                start2++;
            }
            counter++;
        }
        while (start1 <= end1) {
            temp[start + counter] = array[start1];
            start1++;
            counter++;
        }
        while (start2 <= end2) {
            temp[start + counter] = array[start2];
            start2++;
            counter++;
        }
        System.arraycopy(temp, start, array, start, counter);
        PrintUtil.printIntArray(array);
        PrintUtil.printIntArray(temp);
    }

}
