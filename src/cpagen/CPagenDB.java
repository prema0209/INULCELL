/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpagen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UsuiTakumi
 */
public class CPagenDB {
    private CPagenLihat lihat;
    private Connection connection=null;
    private Statement stmt;
    
    
    public CPagenDB(){
        lihat=new CPagenLihat();
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
    
    public boolean tambah(String sql) {
        boolean connect=connectDB();
        
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
    
    public Object[][] lihat(int index){
        boolean connect=connectDB();
         
         
        Object[][] data = new Object[15][3];
        
        
        if(connect){
            try {
                ResultSet rsagen=stmt.executeQuery("SELECT * from agen");
                for(int i=0;i<index-15;i++) rsagen.next();


                for(int i=0;i<15;i++){
                        if( rsagen.next()){
                        data[i][0]=rsagen.getString("ID");
                        data[i][1]=rsagen.getString("nama");
                        data[i][2]=rsagen.getString("NoHp");
                        }
                        else break;
                }



            } catch (SQLException ex) {
                Logger.getLogger(CPagenDB.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
                 
         
         
                 return data;    
    }
    
    public boolean hapus(String sql){
         boolean connect=connectDB();
        
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