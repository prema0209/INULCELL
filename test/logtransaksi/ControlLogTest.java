/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logtransaksi;

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
public class ControlLogTest {
    
    public ControlLogTest() {
    }
  

    /**
     * Test of tambahLog method, of class ControlLog.
     */
    @Test
    public void testTambahLog() {
        System.out.println("tambahLog");
        String NoHp = "081910287371";
        String Provider = "tel";
        String nominal = "10.000";
        ControlLog instance = new ControlLog();
        boolean expResult = true;
        boolean result = instance.tambahLog(NoHp, Provider, nominal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of lihatLog method, of class ControlLog.
     */
    @Test
    public void testLihatLog() {
        System.out.println("lihatLog");
        int awal = 0;
        int akhir = 0;
        ControlLog instance = new ControlLog();
        instance.lihatLog(awal, akhir);
        
    }

    /**
     * Test of hapusLog method, of class ControlLog.
     */
    @Test
    public void testHapusLog() {
        System.out.println("hapusLog");
        String Id = "16";
        ControlLog instance = new ControlLog();
        boolean expResult = true;
        boolean result = instance.hapusLog(Id);
        assertEquals(expResult, result);
        
    }
    
}
