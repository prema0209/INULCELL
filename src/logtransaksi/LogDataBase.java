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
  
    Connection connection;
    Statement stmt;
    ResultSet saldo;
    boolean connect;
    
    
    public LogDataBase(){
       
        connection=null;
        connect=false;
        
        
    }
    
    
    public boolean connectDB(){
        try {
            connection=DriverManager.getConnection("jdbc:ucanaccess://"
                    +"E:/INULCELL.accdb;","","");
            
            
            stmt= connection.createStatement();
            
            
            return true;
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
           return false;
        }
    }
    
    public boolean kurangSaldo(int nominal){
        connectDB();
        try {
            saldo=stmt.executeQuery("SELECT * from saldo");
            
          
           
           saldo.next();
           long saldoUpdate=saldo.getLong("saldo");
           
           
           long saldoUpdate2=saldoUpdate-nominal;
           
           if(saldoUpdate2<0){
               return false;
           }
           else{
           String sql2="Update saldo Set "
                +"saldo='"+saldoUpdate2+"' where saldo="+saldoUpdate;
           
           
           
           int berhasil=stmt.executeUpdate(sql2);
           
           return true;
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(LogDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
          
    }
    
    public boolean tambahLog(String sql){
        
        connect=connectDB();
        
        if(connect){
            try{
               int berhasil=stmt.executeUpdate(sql);

                return true;

            }
            catch (SQLException errMsg) {
               System.out.println("ada kesalahan : "+ errMsg.getMessage());

            return false;
            }
        }
        else return false;
        
        
        
    }
    
    public Object[][] LihatLog(int index){
        
        connect=connectDB();
        
        Object[][] data = new Object[15][5];
        
        if(connect){
            try {
                ResultSet rsLogTransaksi=stmt.executeQuery("SELECT * from LogTransaksi");
                for(int i=0;i<index-15;i++) rsLogTransaksi.next();


                for(int i=0;i<15;i++){



                        if( rsLogTransaksi.next()){
                        data[i][0]=rsLogTransaksi.getString("ID");
                        data[i][1]=rsLogTransaksi.getString("tanggal");
                        data[i][2]=rsLogTransaksi.getString("NoHp");
                        data[i][3]=rsLogTransaksi.getString("provider");
                        data[i][4]=rsLogTransaksi.getString("nominal");
                        }
                        else break;
                }



            } catch (SQLException ex) {
                Logger.getLogger(LogDataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
                 
         
         
                 return data;
    }
    
    public boolean hapusLog(String sql) {
        connect=connectDB();
        
        if(connect){
            try{
               int berhasil=stmt.executeUpdate(sql);

                return true;

            }
            catch (SQLException errMsg) {
               System.out.println("ada kesalahan : "+ errMsg.getMessage());

            return false;
            }
        }
        else return false;
    }
}
