/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logtransaksi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prema
 */
public class ControlLogIT {
    
    Calendar cal;
    SimpleDateFormat format;
    
    public ControlLogIT() {
        cal = Calendar.getInstance();

        format = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of cek method, of class ControlLog.
     */
    @Test
    public void testCek() {
        System.out.println("cek");
        String NoHp = "081910287371";
        ControlLog instance = new ControlLog();
        boolean expResult = true;
        boolean result = instance.cek(NoHp);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCek1() {
        System.out.println("cek");
        String NoHp = "081822384";
        ControlLog instance = new ControlLog();
        boolean expResult = false;
        boolean result = instance.cek(NoHp);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCek2() {
        System.out.println("cek");
        String NoHp = "6281910287371";
        ControlLog instance = new ControlLog();
        boolean expResult = true;
        boolean result = instance.cek(NoHp);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCek3() {
        System.out.println("cek");
        String NoHp = "123456789";
        ControlLog instance = new ControlLog();
        boolean expResult = false;
        boolean result = instance.cek(NoHp);
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testCek4() {
        System.out.println("cek");
        String NoHp = "0987Uhjk";
        ControlLog instance = new ControlLog();
        boolean expResult = false;
        boolean result = instance.cek(NoHp);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tambahLog method, of class ControlLog.
     */
    @Test
    public void testTambahLog() {
        System.out.println("tambahLog");
        String NoHp = "0000";
        String Provider = "test";
        String nominal = "1111";
        ControlLog instance = new ControlLog();
        boolean expResult = true;
        boolean result = instance.tambahLog(NoHp, Provider, nominal);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of lihatLog method, of class ControlLog.
     */
    @Test
    public void testLihatLog() {
        System.out.println("lihatLog");
        int index = 0;
        ControlLog instance = new ControlLog();
        Object[][] expResult = new Object[15][5];
        expResult[0][0]="1";
        expResult[0][1]=format.format(cal.getTime());
        expResult[0][2]="0000";
        expResult[0][3]="telkomsel";
        expResult[0][4]="100000";
        Object[][] result = instance.lihatLog(index);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of hapusLog method, of class ControlLog.
     */
    @Test
    public void testHapusLog() {
        System.out.println("hapusLog");
        String Id = "2";
        ControlLog instance = new ControlLog();
        boolean expResult = true;
        boolean result = instance.hapusLog(Id);
        assertEquals(expResult, result);
        
    }
    
}
