/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpagen;

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
public class CpControlTest {
    
    public CpControlTest() {
    }
    


    /**
     * Test of tambah method, of class CpControl.
     */
    @Test
    public void testTambah() {
        System.out.println("tambah");
        String nama = "";
        String NoHp = "";
        CpControl instance = new CpControl();
        boolean expResult = true;
        boolean result = instance.tambah(nama, NoHp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of lihat method, of class CpControl.
     */
 

    /**
     * Test of hapus method, of class CpControl.
     */
    @Test
    public void testHapus() {
        System.out.println("hapus");
        String nama = "";
        CpControl instance = new CpControl();
        boolean expResult = true;
        boolean result = instance.hapus(nama);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
