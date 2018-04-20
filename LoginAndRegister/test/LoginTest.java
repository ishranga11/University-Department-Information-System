/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JButton;
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
public class LoginTest {
    
    public LoginTest() {
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
     * Test of main method, of class Login.
     */
    
    @Test
    public void testMain() throws InterruptedException {
        Login lg = new Login();
        lg.pack();
        lg.Clickstu();
        lg.setuser ("011");
        lg.setpass ("2");
        lg.Clicklogin();
        assertEquals ( "Is userlogin cleared " , "011" , lg.checklogin() );
        assertEquals ( "Is userpass cleared " , "2" , lg.checkpass() );
    }
    
    @Test
    public void testMain2() {
        Login lg = new Login();
        lg.pack();
        lg.Clickstu();
        lg.setuser ("01111");
        lg.setpass ("2");
        lg.Clicklogin();
        assertEquals ( "Is userlogin cleared " , "01111" , lg.checklogin() );
        assertEquals ( "Is userpass cleared " , null , lg.checkpass() );
        
        
    }
    
    @Test
    public void testMain3() throws InterruptedException {
        Login lg = new Login();
        lg.pack();
        lg.Clickfac();
        lg.setuser ("a");
        lg.setpass ("1");
        lg.Clicklogin();
        assertEquals ( "Is userlogin cleared " , "a" , lg.checklogin() );
        assertEquals ( "Is userpass cleared " , "1" , lg.checkpass() );
    }
    
    @Test
    public void testMain4() {
        Login lg = new Login();
        lg.pack();
        lg.Clickfac();
        lg.setuser ("01111");
        lg.setpass ("2");
        lg.Clicklogin();
        assertEquals ( "Is userlogin cleared " , "01111" , lg.checklogin() );
        assertEquals ( "Is userpass cleared " , null , lg.checkpass() );
        
        
    }
    
    @Test
    public void testMain5() throws InterruptedException {
        Login lg = new Login();
        lg.pack();
        lg.Clickadmin();
        lg.setuser ("Admin12");
        lg.setpass ("pass");
        lg.Clicklogin();
        assertEquals ( "Is userlogin cleared " , "Admin12" , lg.checklogin() );
        assertEquals ( "Is userpass cleared " , "pass" , lg.checkpass() );
    }
    
    @Test
    public void testMain6() {
        Login lg = new Login();
        lg.pack();
        lg.Clickadmin();
        lg.setuser ("01111");
        lg.setpass ("2");
        lg.Clicklogin();
        assertEquals ( "Is userlogin cleared " , "01111" , lg.checklogin() );
        assertEquals ( "Is userpass cleared " , null , lg.checkpass() );
        
        
    }
    
}
