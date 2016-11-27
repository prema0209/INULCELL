/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prema
 */
public class LogInTest {
    
    public LogInTest() {
    }
    
    
    /**
     * Test of newUser method, of class LogIn.
     */


    /**
     * Test of login method, of class LogIn.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String user = "";
        String password = "";
        LogIn instance = new LogIn();
        boolean expResult = true;
        boolean result = instance.login(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
