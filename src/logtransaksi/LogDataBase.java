/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logtransaksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prema
 */


public class LogDataBase {
    LihatLog lihat;
    Connection connection=null;
    Statement stmt;
    ResultSet saldo;
    
    
    public LogDataBase(){
        lihat=new LihatLog();
        
        
    }
    
    
    public void connectDB(){
        try {
            connection=DriverManager.getConnection("jdbc:ucanaccess://"
                    +"E:/INULCELL.accdb;","","");
            
            System.out.println("berhasil");
            
            stmt= connection.createStatement();
            //rsLogTransaksi=stmt.executeQuery("SELECT * from LogTransaksi");
            
            
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
    }
    
    public boolean kurangSaldo(String nominal){
        try {
            saldo=stmt.executeQuery("SELECT * from saldo");
            
            System.out.println("test");
           
           saldo.next();
           long saldoUpdate=saldo.getLong("saldo");
           System.out.println("test");
           
           long saldoUpdate2=saldoUpdate-(Integer.parseInt(nominal));
           
           String sql2="Update saldo Set "
                +"saldo='"+saldoUpdate2+"' where saldo="+saldoUpdate;
           System.out.println(sql2);
           
           
           int berhasil=stmt.executeUpdate(sql2);
           System.out.println("test");
           
        } catch (SQLException ex) {
            Logger.getLogger(LogDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
          return false;
    }
    
    public boolean tambahLog(String sql, String nominal){
        
        connectDB();
        
        try{
           int berhasil=stmt.executeUpdate(sql);
            System.out.println("test");
            
            return true;
           
        }
        catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
           
        return false;
        }
        
        
        
        
    }
    
    public void LihatLog(){
        
        
        
    }
    
    public boolean hapusLog(int NoID) {
        
        
        return false;
    }
}
