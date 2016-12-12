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
public class CPagenDBTest {
    
    public CPagenDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of connectDB method, of class CPagenDB.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        CPagenDB instance = new CPagenDB();
        instance.connectDB();
        
    }

    /**
     * Test of tambah method, of class CPagenDB.
     */
    @Test
    public void testTambah() {
        System.out.println("tambah");
        String sql = "INSERT INTO Agen (Nama, NoHp) VALUES 'test', '0000'";
        CPagenDB instance = new CPagenDB();
        boolean expResult = true;
        boolean result = instance.tambah(sql);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lihat method, of class CPagenDB.
     */
    @Test
    public void testLihat() {
        System.out.println("lihat");
        int index = 0;
        CPagenDB instance = new CPagenDB();
        Object[][] expResult = new Object[15][3];
        expResult[0][0]="3";
        expResult[0][1]="test";
        expResult[0][2]="0000";
        Object[][] result = instance.lihat(15);
        assertArrayEquals(expResult, result);
        
        System.out.print(result);
        
    }

    /**
     * Test of hapus method, of class CPagenDB.
     */
    @Test
    public void testHapus() {
        System.out.println("hapus");
        String sql = "delete from agen "
                +"where id='"+2+"'"; 
        CPagenDB instance = new CPagenDB();
        boolean expResult = true;
        boolean result = instance.hapus(sql);
        assertEquals(expResult, result);
     
    }
    
}
