/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ishan
 */
public class HomeFacTest {
    
    public HomeFacTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class HomeFac.
     */
     @Test
    public void testMain() {
        HomeFac hsc = new HomeFac("a");
        String[] check = hsc.info();
        assertEquals("Contact","   122",check[0]);
        assertEquals("email id","   ds",check[1]);
        assertEquals("Course","   dsds",check[2]);
        assertEquals("name,","   sadsa dsad,",check[3]);
    }
    
    @Test
    public void testMain2() {
        HomeFac hsc = new HomeFac("0111");
        String[] check = hsc.info();
        assertEquals("Contact","",check[0]);
        assertEquals("email id","",check[1]);
        assertEquals("course","",check[2]);
        assertEquals("name","",check[3]);
    }
    
}
