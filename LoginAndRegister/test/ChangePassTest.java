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
public class ChangePassTest {
    
    public ChangePassTest() {
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
     * Test of main method, of class ChangePass.
     */
    @Test
    public void testMain() {
        ChangePass cp = new ChangePass("011","S");
        cp.setopass("2");
        cp.setpass("3");
        cp.setrpass("3");
        String[] g = cp.manual();
        assertEquals("old","2",g[0]);
        assertEquals("new","3",g[1]);
        assertEquals("re","3",g[2]);
    }
    
    @Test
    public void testMain2() {
        ChangePass cp = new ChangePass("011","S");
        cp.setopass("4");
        cp.setpass("3");
        cp.setrpass("3");
        String[] g = cp.manual();
        assertEquals("old",null,g[0]);
        assertEquals("new",null,g[1]);
        assertEquals("re",null,g[2]);
    }
    
    @Test
    public void testMain3() {
        ChangePass cp = new ChangePass("011","S");
        cp.setopass("2");
        cp.setpass("3");
        cp.setrpass("4");
        String[] g = cp.manual();
        assertEquals("old",null,g[0]);
        assertEquals("new",null,g[1]);
        assertEquals("re",null,g[2]);
    }
    
}
