package linkedlist;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import util.PrintUtil;

import static org.junit.Assert.assertEquals;

/** 
* SortList Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 22, 2016</pre> 
* @version 1.0 
*/ 
public class SortListTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sortList(ListNode head) 
* 
*/ 
@Test
public void testSortList() throws Exception {
    {
        ListNode l0 = new ListNode(0);
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(4);
        l0.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        assertEquals("0->1->2->3->4->null", PrintUtil.printListString(new SortList().sortList(l0)));
    }
}


/** 
* 
* Method: mergeSort(ListNode head) 
* 
*/ 
@Test
public void testMergeSort() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SortList.getClass().getMethod("mergeSort", ListNode.class); 
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
* Method: merge(ListNode left, ListNode right) 
* 
*/ 
@Test
public void testMerge() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SortList.getClass().getMethod("merge", ListNode.class, ListNode.class); 
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
* Method: findRightHeadAndCut(ListNode head) 
* 
*/ 
@Test
public void testFindRightHeadAndCut() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SortList.getClass().getMethod("findRightHeadAndCut", ListNode.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
