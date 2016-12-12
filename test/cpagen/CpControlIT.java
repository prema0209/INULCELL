/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpagen;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prema
 */
public class CpControlIT {
    
    public CpControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of tambah method, of class CpControl.
     */
    @Test
    public void testTambah() {
        System.out.println("tambah");
        String nama = "test";
        String NoHp = "0000";
        CpControl instance = new CpControl();
        boolean expResult = true;
        boolean result = instance.tambah(nama, NoHp);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lihat method, of class CpControl.
     */
    @Test
    public void testLihat() {
        System.out.println("lihat");
        int index = 0;
        CpControl instance = new CpControl();
         Object[][] expResult = new Object[15][3];
        expResult[0][0]="2";
        expResult[0][1]="test";
        expResult[0][2]="0000";
        Object[][] result = instance.lihat(index);
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of hapus method, of class CpControl.
     */
    @Test
    public void testHapus() {
        System.out.println("hapus");
        String id = "1";
        CpControl instance = new CpControl();
        boolean expResult = true;
        boolean result = instance.hapus(id);
        assertEquals(expResult, result);
        
    }
    
}
