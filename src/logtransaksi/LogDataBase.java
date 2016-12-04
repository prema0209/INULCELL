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
            
            
            stmt= connection.createStatement();
            //rsLogTransaksi=stmt.executeQuery("SELECT * from LogTransaksi");
            
            
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
    }
    
    public boolean kurangSaldo(String nominal){
        try {
            saldo=stmt.executeQuery("SELECT * from saldo");
            
          
           
           saldo.next();
           long saldoUpdate=saldo.getLong("saldo");
           
           
           long saldoUpdate2=saldoUpdate-(Integer.parseInt(nominal));
           
           String sql2="Update saldo Set "
                +"saldo='"+saldoUpdate2+"' where saldo="+saldoUpdate;
           
           
           
           int berhasil=stmt.executeUpdate(sql2);
           
           return true;
           
           
        } catch (SQLException ex) {
            Logger.getLogger(LogDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
          
    }
    
    public boolean tambahLog(String sql){
        
        connectDB();
        
        try{
           int berhasil=stmt.executeUpdate(sql);
            
            return true;
           
        }
        catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
           
        return false;
        }
        
        
        
        
    }
    
    public void LihatLog(){
        
        
        
    }
    
    public boolean hapusLog(String sql) {
        connectDB();
        
        try{
           int berhasil=stmt.executeUpdate(sql);
            
            return true;
           
        }
        catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
           
        return false;
        }
    }
}
