package linkedlist;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by wuwenjie on 2/18/16.
 */
public class MergeKSortedLists {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        if (lists == null || lists.size() == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;

        int k = lists.size();
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(k, new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                // 这里原来写的 o1.val - o2.val
                // 由于我才用Integer.MIN_VALUE和Interger.MAX_VALUE,按上面那种减法会溢出
                return o1.val < o2.val ? -1: 1;
            }
        });

        for (int i = 0; i < k; i++) {
            ListNode dummy = new ListNode(Integer.MIN_VALUE);
            dummy.next = lists.get(i);
            queue.offer(dummy);
        }

        while (queue.peek().val != Integer.MAX_VALUE) {
            ListNode current = queue.poll();
            tail.next = current;
            tail = current;
            queue.offer(next(current));
        }

        for (int i = 0; i < k; i++) {
            dummyHead = dummyHead.next;
        }
        return dummyHead.next;
    }

    public ListNode next(ListNode head) {
        if (head.next == null) {
            ListNode dummyEnd = new ListNode(Integer.MAX_VALUE);
            return dummyEnd;
        }
        return head.next;
    }

}
