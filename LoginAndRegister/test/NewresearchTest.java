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
public class NewresearchTest {
    
    public NewresearchTest() {
        Newresearch n = new Newresearch();
        n.setVisible(true);
        n.pack();
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
     * Test of main method, of class Newresearch.
     */
    @Test
    public void testMain() {
        
        Newresearch n = new Newresearch();
        n.settitle ("A");
        n.setprofu("B");
        n.setdesc("C");
        String[] c = n.info ("A");
        assertEquals("title","A",c[0]);
        assertEquals("prof","B",c[1]);
        assertEquals("desc","C",c[2]);
        
        
    }
    
}
