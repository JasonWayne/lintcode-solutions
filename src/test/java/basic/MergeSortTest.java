package basic;

import basic.MergeSort;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import util.PrintUtil;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * MergeSort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 22, 2016</pre>
 */
public class MergeSortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: mergeSort(int[] array)
     */
    @Test
    public void testMergeSort() throws Exception {
        {
            int[] array = {3, 2};
            MergeSort.mergeSort(array);
            assertEquals("[2, 3]", PrintUtil.printIntArrayString(array));
        }

        {
            int[] array = {1, 3, 6, 4, 2, 5};
            MergeSort.mergeSort(array);
            assertEquals("[1, 2, 3, 4, 5, 6]", PrintUtil.printIntArrayString(array));
        }

        {
            int[] array = {1, 3, 6, 4, 2, 5, 5, 2, 5, 2, 3, 5, 6};
            MergeSort.mergeSort(array);
            int[] array2 = array.clone();
            assertEquals(PrintUtil.printIntArrayString(array),
                    PrintUtil.printIntArrayString(array2));
        }

    }

    /**
     * Method: helper(int[] array, int start, int end, int[] temp)
     */
    @Test
    public void testHelper() throws Exception {
    }


    /**
     * Method: merge(int[] array, int start, int mid, int i, int end)
     */
    @Test
    public void testMerge() throws Exception {
/*
try { 
   Method method = MergeSort.getClass().getMethod("merge", int[].class, int.class, int.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
