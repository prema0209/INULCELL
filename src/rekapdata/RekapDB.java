/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rekapdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logtransaksi.LihatLog;

/**
 *
 * @author prema
 */
public class RekapDB {
    LihatLog lihat;
    Connection connection=null;
    Statement stmt;
    ResultSet data;
    
    public RekapDB(){
        
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
    
    public String ambilData(String sql){
        connectDB();
                
        try {
             System.out.print("test");
            data=stmt.executeQuery(sql);
            
            System.out.print("test");
            data.next();
            String a=data.getString("data");
            
            
            return a;
            
        } 
           catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
           
             return "";
        
                }
    }
}
