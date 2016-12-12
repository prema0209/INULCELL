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
public class LogDataBaseIT {
   
    Calendar cal;
    SimpleDateFormat format;
    
    public LogDataBaseIT() {
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
     * Test of connectDB method, of class LogDataBase.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        LogDataBase instance = new LogDataBase();
        boolean expResult = true;
        boolean result = instance.connectDB();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of kurangSaldo method, of class LogDataBase.
     */
    @Test
    public void testKurangSaldo() {
        System.out.println("kurangSaldo");
        int nominal = 0;
        LogDataBase instance = new LogDataBase();
        boolean expResult = true;
        boolean result = instance.kurangSaldo(nominal);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tambahLog method, of class LogDataBase.
     */
    @Test
    public void testTambahLog() {
         String Tanggal = format.format(cal.getTime());
        System.out.println("tambahLog");
        String sql = "Insert Into logtransaksi (Tanggal, NoHp, provider,nominal, untung, angka) Values '"+Tanggal+"', '0000', 'test', '1111', '999', '12345'";
        LogDataBase instance = new LogDataBase();
        boolean expResult = true;
        boolean result = instance.tambahLog(sql);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of LihatLog method, of class LogDataBase.
     */
    @Test
    public void testLihatLog() {
        System.out.println("LihatLog");
        int index = 0;
        LogDataBase instance = new LogDataBase();
        Object[][] expResult = new Object[15][5];
        expResult[0][0]="1";
        expResult[0][1]="12/12/2016";
        expResult[0][2]="0000";
        expResult[0][3]="telkomsel";
        expResult[0][4]="100000";
        Object[][] result = instance.LihatLog(index);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of hapusLog method, of class LogDataBase.
     */
    @Test
    public void testHapusLog() {
        System.out.println("hapusLog");
        String sql = "delete from logtransaksi "
                +"where id='"+3+"'";
        LogDataBase instance = new LogDataBase();
        boolean expResult = true;
        boolean result = instance.hapusLog(sql);
        assertEquals(expResult, result);
        
    }
    
}
