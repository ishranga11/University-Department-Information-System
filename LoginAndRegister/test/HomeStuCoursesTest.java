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
public class HomeStuCoursesTest {
    
    public HomeStuCoursesTest() {
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
     * Test of main method, of class HomeStuCourses.
     */
    @Test
    public void testMain() {
        HomeStuCourses hsc = new HomeStuCourses("011");
        String[] check = hsc.info();
        assertEquals("Contact","9876765400",check[0]);
        assertEquals("email id","ish.ranga11@gmail.com",check[1]);
        assertEquals("date of birth","2018-03-14",check[2]);
        assertEquals("address","House Nommmmmmmmmmmmmmmkkkkkkkkkkkkkkkkkkkkkkkkkkkks",check[3]);
        assertEquals("name","Ishan  Ranga,",check[4]);
    }
    
    @Test
    public void testMain2() {
        HomeStuCourses hsc = new HomeStuCourses("0111");
        String[] check = hsc.info();
        assertEquals("Contact","",check[0]);
        assertEquals("email id","",check[1]);
        assertEquals("date of birth","",check[2]);
        assertEquals("address","",check[3]);
        assertEquals("name","",check[4]);
    }
    
}
