package linkedlist;

import linkedlist.ListNode;
import linkedlist.ReorderList;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** 
* ReorderList Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 19, 2016</pre> 
* @version 1.0 
*/ 
public class ReorderListTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

/**
* 
* Method: reorderList(ListNode head) 
* 
*/ 
@Test
public void testReorderList() throws Exception {
//TODO: Test goes here...
//    {
//        ReorderList reorder = new ReorderList();
//        ListNode l0 = new ListNode(2);
//        ListNode l1 = new ListNode(-1);
//        ListNode l2 = new ListNode(0);
//        l0.next = l1;
//        l1.next = l2;
//        reorder.reorderList(l0);
//        assertTrue(ListNode.printListString(l0).equals("2->0->-1->null"));
//    }

    {
        ReorderList reorder = new ReorderList();
        ListNode l0 = new ListNode(0);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l0.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        reorder.reorderList(l0);
        assertTrue(ListNode.printListString(l0).equals("0->4->1->3->2->null"));
    }



} 


/** 
* 
* Method: findMiddle(ListNode head) 
* 
*/ 
@Test
public void testFindMiddle() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ReorderList.getClass().getMethod("findMiddle", ListNode.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: reverse(ListNode head) 
* 
*/ 
@Test
public void testReverse() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ReorderList.getClass().getMethod("reverse", ListNode.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: merge(ListNode head1, ListNode head2) 
* 
*/ 
@Test
public void testMerge() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ReorderList.getClass().getMethod("merge", ListNode.class, ListNode.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
