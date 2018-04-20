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
public class RegisterTest {
    
    public RegisterTest() {
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
     * Test of main method, of class Register.
     */
    @Test
    public void testMain() {
        Register r = new Register();
        String[] cre = new String[9];
        cre = r.create("Ishan","Ranga","011","9876765400","House Nommmmmmmmmmmmmmmkkkkkkkkkkkkkkkkkkkkkkkkkkkks","2","2","ish.ranga11@gmail.com","M");
        assertEquals("Name","Ishan Ranga",cre[0] + cre[1]);
        assertEquals("userid","011",cre[2]);
        assertEquals("password","2",cre[5]);
        assertEquals("sex","M",cre[8]);
    }
    @Test
    public void testMain2() {
        Register r = new Register();
        String[] cre = new String[9];
        cre = r.create("Ishan","Ranga","011","9876765400","House Nommmmmmmmmmmmmmmkkkkkkkkkkkkkkkkkkkkkkkkkkkks","2","4","ish.ranga11@gmail.com","M");
        assertEquals("password",null,cre[5]);
        assertEquals("repassword",null,cre[6]);
    }
    
    @Test
    public void testMain3() {
        Register r = new Register();
        String[] cre = new String[9];
        cre = r.create("Ishan","Ranga","","9876765400","House Nommmmmmmmmmmmmmmkkkkkkkkkkkkkkkkkkkkkkkkkkkks","2","2","ish.ranga11@gmail.com","M");
        assertEquals("Name",null,cre[0]);
        assertEquals("userid",null,cre[2]);
    }
    
    @Test
    public void testMain4() {
        Register r = new Register();
        String[] cre = new String[9];
        cre = r.create("Ishan","","011","9876765400","House Nommmmmmmmmmmmmmmkkkkkkkkkkkkkkkkkkkkkkkkkkkks","2","2","ish.ranga11@gmail.com","M");
        assertEquals("Name",null,cre[0]);
        assertEquals("userid",null,cre[2]);
    }
    
    @Test
    public void testMain5() {
        Register r = new Register();
        String[] cre = new String[9];
        cre = r.create("Ishan","Ranga","011","9876765","House Nommmmmmmmmmmmmmmkkkkkkkkkkkkkkkkkkkkkkkkkkkks","2","2","ish.ranga11@gmail.com","M");
        assertEquals("Contact",null,cre[3]);
    }
    
}
