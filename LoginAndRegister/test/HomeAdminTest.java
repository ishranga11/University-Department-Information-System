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
public class HomeAdminTest {
    
    public HomeAdminTest() {
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
     * Test of main method, of class HomeAdmin.
     */
    @Test
    public void testMain() {
        HomeAdmin hsc = new HomeAdmin("Admin12");
        String[] check = hsc.info();
        assertEquals("Contact","   1234567890",check[0]);
        assertEquals("email id","   safshdaf@sajkkfhas.com",check[1]);

    }
    
    @Test
    public void testMain2() {
        HomeAdmin hsc = new HomeAdmin("0111");
        String[] check = hsc.info();
        assertEquals("Contact","",check[0]);
        assertEquals("email id","",check[1]);

    }
    
}
