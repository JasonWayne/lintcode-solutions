package linkedlist;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by wuwenjie on 2/19/16.
 */
public class MergeKSortedLists1 {

    private class ListNodeComparator implements Comparator<ListNode> {
        public int compare(ListNode n1, ListNode n2) {
            return n1.val - n2.val;
        }
    }

    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists == null || lists.size() == 0) {
            return null;
        }

        Queue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), new ListNodeComparator());

        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (queue.peek() != null) {
            ListNode node = queue.poll();
            if (node.next != null) {
                queue.offer(node.next);
            }
            current.next = node;
            current = node;
        }

        return dummy.next;
    }

}
