package linkedlist;

/**
 * Created by wuwenjie on 2/10/16.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
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
