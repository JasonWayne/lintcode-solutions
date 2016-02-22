package linkedlist;

import util.PrintUtil;

/**
 * Created by wuwenjie on 2/22/16.
 */
public class SortList {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        head = mergeSort(head);
        return head;
    }

    private ListNode mergeSort(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode right = findRightHeadAndCut(head);
        ListNode left = mergeSort(head);
        right = mergeSort(right);
        head = merge(left, right);
        return head;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        while (left != null) {
            tail.next = left;
            left = left.next;
            tail = tail.next;
        }

        while (right != null) {
            tail.next = right;
            right = right.next;
            tail = tail.next;
        }

        return dummy.next;
    }

    private ListNode findRightHeadAndCut(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode result = slow.next;
        slow.next = null;
        return result;
    }

}
