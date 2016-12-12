/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prema
 */
public class SaldoDBIT {
    
    public SaldoDBIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of connectDB method, of class SaldoDB.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        SaldoDB instance = new SaldoDB();
        boolean expResult = true;
        boolean result = instance.connectDB();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tambahDb method, of class SaldoDB.
     */
    @Test
    public void testTambahDb() {
        System.out.println("tambahDb");
        String sql = "Update Saldo set saldo="
                +"'"+100100+"'";
        SaldoDB instance = new SaldoDB();
        boolean expResult = true;
        boolean result = instance.tambahDb(sql);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of LihatSaldo method, of class SaldoDB.
     */
    @Test
    public void testLihatSaldo() {
        System.out.println("LihatSaldo");
        SaldoDB instance = new SaldoDB();
        String expResult = "100100";
        String result = instance.LihatSaldo();
        assertEquals(expResult, result);
        
    }
    
}
