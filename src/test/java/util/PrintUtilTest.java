package test.util; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import util.PrintUtil;

import static org.junit.Assert.assertEquals;

/** 
* PrintUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 22, 2016</pre> 
* @version 1.0 
*/ 
public class PrintUtilTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: printIntArrayString(int[] array) 
* 
*/ 
@Test
public void testPrintIntArrayString() throws Exception {
    assertEquals(PrintUtil.printIntArrayString(new int[]{1,2,3}), "[1, 2, 3]");
}


} 
