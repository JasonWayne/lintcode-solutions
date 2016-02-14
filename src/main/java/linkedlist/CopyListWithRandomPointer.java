package linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * http://www.lintcode.com/en/problem/copy-list-with-random-pointer/#
 * Created by wuwenjie on 2/14/16.
 */
public class CopyListWithRandomPointer {
    /**
     * Definition for singly-linked list with a random pointer.
     * class RandomListNode {
     *     int label;
     *     RandomListNode next, random;
     *     RandomListNode(int x) { this.label = x; }
     * };
     */
    public class Solution {
        /**
         * @param head: The head of linked list with a random pointer.
         * @return: A new head of a deep copy of the list.
         */
        public RandomListNode copyRandomList(RandomListNode head) {
            // key: oldNode, value: newNode
            Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

            RandomListNode dummy = new RandomListNode(0);
            dummy.next = head;

            RandomListNode newDummy = new RandomListNode(0);

            // copy the linked list
            RandomListNode last = newDummy;
            while (head != null) {
                RandomListNode newHead = new RandomListNode(head.label);
                map.put(head, newHead);
                last.next = newHead;
                last = newHead;
                head = head.next;
            }

            // copy random pointer
            RandomListNode current = dummy.next;
            RandomListNode currentNew = newDummy.next;
            while (current != null) {
                currentNew.random = map.get(current.random);
                currentNew = currentNew.next;
                current = current.next;
            }

            return newDummy.next;

        }
    }
}
