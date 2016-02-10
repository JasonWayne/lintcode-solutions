package linkedlist;

import tree.TreeNode;

/**
 * http://www.lintcode.com/en/problem/convert-sorted-list-to-balanced-bst/
 * Created by wuwenjie on 2/10/16.
 */
public class ConvertSortedListToBalancedBST {

    /**
     * 返回链表长度
     * @param head
     * @return
     */
    public int getListSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size += 1;
            head = head.next;
        }

        return size;
    }

    /**
     *
     * @param head 待转换的LinkedList头
     * @param size 待转换的LinkedList的长度
     * @return
     */
    public TreeNode helper(ListNode head, int size) {
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return new TreeNode(head.val);
        }

        ListNode mid = head;
        for (int i = 0; i < (size - 1) / 2; i++) {
            mid = mid.next;
        }
        TreeNode root = new TreeNode(mid.val);
        root.left = helper(head, (size - 1) / 2);
        root.right = helper(mid.next, size / 2);
        return root;
    }

    /**
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        int size = getListSize(head);
        TreeNode root = helper(head, size);
        return root;
    }

}
