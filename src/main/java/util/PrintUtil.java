package util;

import linkedlist.ListNode;

/**
 * Created by wuwenjie on 2/22/16.
 */
public class PrintUtil {

    public static String printIntArrayString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            } else {
                sb.append(array[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void printIntArray(int[] array) {
        System.out.println(printIntArrayString(array));
    }

    public static String printListString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        while (head != null) {
            counter ++;
            if (counter >= 100) {
                sb.append("Infinite loop");
                break;
            }
            sb.append(head.val).append("->");
            head = head.next;
        }
        sb.append("null");
        return sb.toString();
    }


    public static void printList(ListNode head) {
        System.out.println(printListString(head));
    }
}
