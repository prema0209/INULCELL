/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prema
 */
public class LogInIT {
    
    public LogInIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of newUser method, of class LogIn.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String user = "admin";
        String password = "admin";
        LogIn instance = new LogIn();
        boolean expResult = true;
        boolean result = instance.login(user, password);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testLogin1() {
        System.out.println("login");
        String user = "admin";
        String password = "amin";
        LogIn instance = new LogIn();
        boolean expResult = false;
        boolean result = instance.login(user, password);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testLogin2() {
        System.out.println("login");
        String user = "amin";
        String password = "admin";
        LogIn instance = new LogIn();
        boolean expResult = false;
        boolean result = instance.login(user, password);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testNewUser() {
        System.out.println("newUser");
        String user = "test";
        String pass = "test";
        LogIn instance = new LogIn();
        boolean expResult = true;
        boolean result = instance.newUser(user, pass);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of login method, of class LogIn.
     */
    
    
}
