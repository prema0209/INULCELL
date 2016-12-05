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
    private ResultSet saldo;
    
    public CPagenDB(){
        lihat=new CPagenLihat();
    }
    /*
    public CPagenDB(String nama, String nohp){
        //this.no = no;
        this.nama = nama;
        this.nohp = nohp;
    }*/
    
    public void connectDB(){
        try {
            connection=DriverManager.getConnection("jdbc:ucanaccess://"
                    +"E:/INULCELL.accdb;","","");
            stmt= connection.createStatement();
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
    }
    
    public boolean tambah(String sql) {
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
    
    public Object[][] lihat(int index){
        connectDB();
        Object[][] data = new Object[15][5];
        
        try {
            ResultSet rsLogTransaksi=stmt.executeQuery("SELECT * from LogTransaksi");
            for(int i=0;i<index-15;i++) rsLogTransaksi.next();
            for(int i=0;i<15;i++){       
                    if( rsLogTransaksi.next()){
                    data[i][0]=rsLogTransaksi.getString("ID");
                    data[i][1]="29/09/1996";
                    data[i][2]=rsLogTransaksi.getString("NoHp");
                    data[i][3]=rsLogTransaksi.getString("provider");
                    data[i][4]=rsLogTransaksi.getString("jumlah");
                    }
                    else break;
            }  
        } catch (SQLException ex) {
            Logger.getLogger(CPagenDB.class.getName()).log(Level.SEVERE, null, ex);
        }        
                 return data;    
    }
    
    public boolean hapus(String sql){
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
