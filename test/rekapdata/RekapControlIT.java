/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapdata;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prema
 */
public class RekapControlIT {
    
    public RekapControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Harian method, of class RekapControl.
     */
    @Test
     public void testHarian() {
        System.out.println("Harian");
        int a = 0;
        int b = 2;
        RekapControl instance = new RekapControl();
        String expResult = "1";
        String result = instance.Harian(a, b);
        assertEquals(expResult, result);
        
    }
     
    @Test  
    public void testHarian1() {
        System.out.println("Harian");
        int a = 0;
        int b = 3;
        RekapControl instance = new RekapControl();
        String expResult = "Telkomsel";
        String result = instance.Harian(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testHarian2() {
        System.out.println("Harian");
        int a = 0;
        int b = 4;
        RekapControl instance = new RekapControl();
        String expResult = "100";
        String result = instance.Harian(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Mingguan method, of class RekapControl.
     */
    @Test
    public void testMingguan() {
        System.out.println("Mingguan");
        int a = 1;
        int b = 2;
        RekapControl instance = new RekapControl();
        String expResult = "1";
        String result = instance.Mingguan(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMingguan1() {
        System.out.println("Mingguan");
        int a = 1;
        int b = 3;
        RekapControl instance = new RekapControl();
        String expResult = "Telkomsel";
        String result = instance.Mingguan(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMingguan2() {
        System.out.println("Mingguan");
        int a = 1;
        int b = 4;
        RekapControl instance = new RekapControl();
        String expResult = "100";
        String result = instance.Mingguan(a, b);
        assertEquals(expResult, result);
        
    }
    
  
     
    

    /**
     * Test of Bulanan method, of class RekapControl.
     */
    @Test
    public void testBulanan() {
        System.out.println("Bulanan");
        int a = 0;
        int b = 2;
        RekapControl instance = new RekapControl();
        String expResult = "1";
        String result = instance.Bulanan(a, b);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testBulanan1() {
        System.out.println("Bulanan");
        int a = 0;
        int b = 3;
        RekapControl instance = new RekapControl();
        String expResult = "Telkomsel";
        String result = instance.Bulanan(a, b);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testBulanan2() {
        System.out.println("Bulanan");
        int a = 0;
        int b = 4;
        RekapControl instance = new RekapControl();
        String expResult = "100";
        String result = instance.Bulanan(a, b);
        assertEquals(expResult, result);
      
    }
    
}
