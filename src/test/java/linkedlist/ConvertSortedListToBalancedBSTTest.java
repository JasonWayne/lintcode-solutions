package linkedlist;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * ConvertSortedListToBalancedBST Tester.
 *
 * @author <Authors name>
 * @since <pre>Feb 10, 2016</pre>
 * @version 1.0
 */
public class ConvertSortedListToBalancedBSTTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getListSize(ListNode head)
     *
     */
    @Test
    public void testGetListSize() throws Exception {
        List<ListNode> nodes = new ArrayList<ListNode>();
        for (int i = 0; i < 10; i++) {
            nodes.add(new ListNode(0));
        }
        ConvertSortedListToBalancedBST convert = new ConvertSortedListToBalancedBST();
        assertEquals(convert.getListSize(nodes.get(0)), 1);
        for (int i = 0; i < 9; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }
        assertEquals(convert.getListSize(nodes.get(0)), 10);
    }

    /**
     *
     * Method: helper(ListNode head, int size)
     *
     */
    @Test
    public void testHelper() throws Exception {

    }

    /**
     *
     * Method: sortedListToBST(ListNode head)
     *
     */
    @Test
    public void testSortedListToBST() throws Exception {

        ConvertSortedListToBalancedBST convert = new ConvertSortedListToBalancedBST();

        // test null
        assertNull(convert.sortedListToBST(null));

        // test one node
        assertEquals(convert.sortedListToBST(new ListNode(0)).val, 0);

        // test example
        List<ListNode> nodes = new ArrayList<ListNode>();
        for (int i = 0; i < 3; i++) {
            nodes.add(new ListNode(i + 1));
        }
        for (int i = 0; i < 2; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }

        TreeNode root = convert.sortedListToBST(nodes.get(0));

        assertEquals(root.val, 2);
        assertEquals(root.left.val, 1);
        assertEquals(root.right.val, 3);
    }


}

