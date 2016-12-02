/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldo;

import cpagen.CPagenDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author UsuiTakumi
 */
public class Saldo {
    
    Connection connection=null;
    Statement stmt;
    ResultSet rsSaldo;
    
    ArrayList<SaldoDB> list =new ArrayList<SaldoDB>();
    String[] title = {"nominal"};
    int index = 0;
    
    public Saldo(){
        try {
            connection=DriverManager.getConnection("jdbc:ucanaccess://"
                    +"D:/E-Book/DDPL - Dasar Dasar Pengembangan Perangkat Lunak/INULCELL;","","");
            
            System.out.println("berhasil");
            
            stmt= connection.createStatement();
            rsSaldo=stmt.executeQuery("SELECT * FROM saldoDB");
            
            while(rsSaldo.next()){
                list.add(new SaldoDB(rsSaldo.getInt("nominal")));
            }
            
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
    }
    
    /*  apabila melakukan tambah(integer), maka return true
        apabila bukan integer, maka retrun false */
    public boolean tambah(int saldo){
        return true;
    }
    
    public void lihat(){
        
    }
}
