/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapdata;

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
public class RekapDBIT {
    
    
    Calendar cal;
    SimpleDateFormat format;
    
    
    public RekapDBIT() {
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
     * Test of connectDB method, of class RekapDB.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        RekapDB instance = new RekapDB();
        boolean expResult = true;
        boolean result = instance.connectDB();
        assertEquals(expResult, result);
    }

    /**
     * Test of ambilData method, of class RekapDB.
     */
    @Test
    public void testAmbilData() {
        String Tanggal = format.format(cal.getTime());
        System.out.println("ambilData");
        String sql = "SELECT count(id) as data from logtransaksi where tanggal='"+Tanggal+"'";
        RekapDB instance = new RekapDB();
        String expResult = "1";
        String result = instance.ambilData(sql);
        assertEquals(expResult, result);
       
    }
    
}
