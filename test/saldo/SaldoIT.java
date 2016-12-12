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
public class SaldoIT {
    
    public SaldoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of tambah method, of class Saldo.
     */
    @Test
    public void testTambah() {
        System.out.println("tambah");
        int saldo = 0;
        Saldo instance = new Saldo();
        boolean expResult = true;
        boolean result = instance.tambah(saldo);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of lihat method, of class Saldo.
     */
    @Test
    public void testLihat() {
        System.out.println("lihat");
        Saldo instance = new Saldo();
        String expResult = "100100";
        String result = instance.lihat();
        assertEquals(expResult, result);
        
    }
    
}
