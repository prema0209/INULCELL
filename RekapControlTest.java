/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapdata;

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
public class RekapControlTest {
    
    public RekapControlTest() {
    }
    
   

    /**
     * Test of Harian method, of class RekapControl.
     */
    @Test
    public void testHarian() {
        System.out.println("Harian");
        int a = 0;
        int b = 0;
        RekapControl instance = new RekapControl();
        String expResult = "1";
        String result = instance.Harian(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of Mingguan method, of class RekapControl.
     */
    @Test
    public void testMingguan() {
        System.out.println("Mingguan");
        int a = 0;
        int b = 0;
        RekapControl instance = new RekapControl();
        String expResult = "0";
        String result = instance.Mingguan(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of Bulanan method, of class RekapControl.
     */
    @Test
    public void testBulanan() {
        System.out.println("Bulanan");
        int a = 0;
        int b = 0;
        RekapControl instance = new RekapControl();
        String expResult = "0";
        String result = instance.Bulanan(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
