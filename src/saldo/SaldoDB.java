/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import logtransaksi.LogDataBase;

/**
 *
 * @author UsuiTakumi
 */
public class SaldoDB {
    Connection connection;
    Statement stmt;
    ResultSet saldo;
    
    public SaldoDB(){
        connection=null;
    }
    
    public void connectDB(){
        try {
            connection=DriverManager.getConnection("jdbc:ucanaccess://"
                    +"E:/INULCELL.accdb;","","");
            
            
            stmt= connection.createStatement();
            
            
            
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
    }
    
    public boolean tambahDb(String sql){
        
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
    
    public String LihatSaldo(){
        connectDB();
        String saldo="";
        
        
        try {
            
            
                    ResultSet rsLogTransaksi=stmt.executeQuery("SELECT * from saldo");
            
               
                    rsLogTransaksi.next();
                    saldo=rsLogTransaksi.getString("saldo");
                 
            }
            
            
           
        catch (SQLException ex) {
            Logger.getLogger(LogDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
                 
         
         
                 return saldo;
    }
    
}
