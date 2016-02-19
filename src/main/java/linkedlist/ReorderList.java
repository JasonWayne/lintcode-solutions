package linkedlist;

/**
 * Created by wuwenjie on 2/19/16.
 */
public class ReorderList {
    /**
     * @param head: The head of linked list.
     * @return: void
     */
    public void reorderList(ListNode head) {
        // write your code here
        if (head == null || head.next == null || head.next.next == null) {
            return ;
        }

        ListNode mid = findMiddle(head);
        ListNode latterHalf = reverse(mid.next);
        mid.next = null;

        merge(head, latterHalf);
    }

    /**
     *
     * return l1 for (l0 -> l1 -> l2) and (l0 -> l1 -> l2 -> l3)
     * @param head
     * @return: middle of the list
     */
    private ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            } else {
                break;
            }
            slow = slow.next;
        }
        return slow;
    }

    /**
     * @param head: the head of the list to be reveresed
     * @return: the new head of the reversed list
     */
    private ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode(0);

        // 把head下一个插入到head之前
        while (head != null) {
            ListNode temp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = temp;
        }

        return dummy.next;
    }

    /**
     * merge the preprocessed two lists
     */
    private void merge(ListNode head1, ListNode head2) {
        while (head2 != null) {
            ListNode temp = head2.next;
            head2.next = head1.next;
            head1.next = head2;
            head2 = temp;

            head1 = head1.next.next;
        }
    }
}
