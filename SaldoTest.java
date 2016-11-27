/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldo;

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
public class SaldoTest {
    
 

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
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of lihat method, of class Saldo.
     */
  
    
}
