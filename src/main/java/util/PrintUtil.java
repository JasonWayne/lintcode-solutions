package util;

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
}
