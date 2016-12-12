/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LogInDB {
    
  
    Connection connection=null;
    Statement stmt;
    ResultSet data;
    
    public LogInDB(){
        
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
    
    public String ambilData(String sql,String dicari){
        boolean connect=connectDB();
                
        if(connect){
            try {

                data=stmt.executeQuery(sql);


               data.next();
                String a=data.getString(dicari);
                 

                return a;

            } 
               catch (SQLException errMsg) {
               System.out.println("ada kesalahan : "+ errMsg.getMessage());

                 return "";

                    }
        }
        return"";
    }
    
    
    public boolean gantiData(String sql){
        boolean connect=connectDB();
                
        if(connect){
            try {

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