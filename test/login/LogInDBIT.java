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
public class LogInDBIT {
    
    public LogInDBIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of connectDB method, of class LogInDB.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        LogInDB instance = new LogInDB();
        boolean expResult = true;
        boolean result = instance.connectDB();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ambilData method, of class LogInDB.
     */
    @Test
    public void testAmbilData() {
        System.out.println("ambilData");
        String sql = "Select username from login";
        String dicari = "username";
        LogInDB instance = new LogInDB();
        String expResult = "test";
        String result = instance.ambilData(sql, dicari);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of gantiData method, of class LogInDB.
     */
    @Test
    public void testGantiData() {
        System.out.println("gantiData");
        String sql = "Update Login set password='"+98+"'";
        LogInDB instance = new LogInDB();
        boolean expResult = true;
        boolean result = instance.gantiData(sql);
        assertEquals(expResult, result);
        
    }
    
}
