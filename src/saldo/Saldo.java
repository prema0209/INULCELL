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
                    +"D:/E-Book/DDPL - Dasar Dasar Pengembangan Perangkat Lunak/INULCELL/inulcell.accdb;","","");
            
            System.out.println("berhasil connect");
            
            stmt= connection.createStatement();
            rsSaldo=stmt.executeQuery("SELECT * FROM saldo");
            
            while(rsSaldo.next()){
                list.add(new SaldoDB( //rsCP.getString("ID") ,
                        rsSaldo.getString("saldo")));
            }
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
    }
    
    /*  apabila melakukan tambah(integer), maka return true
        apabila bukan integer, maka retrun false */
    public boolean tambah(int saldo){
        String sql;
        
        SaldoDB newSaldo = new SaldoDB();
        newSaldo.setNominal(saldo);
        this.list.add(newSaldo);
       
        sql = "INSERT INTO Saldo (saldo) VALUES"
                +"('"+saldo+"')";
        
        System.out.println(sql);
        
        try{
           int berhasil=stmt.executeUpdate(sql);    
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
        
        //JOptionPane.showMessageDialog(this, "Data Tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        return true; 
    }
    
    //public void lihat(){
    public String lihat(){
        String sql;
        sql = "SELECT sum(saldo) FROM Saldo";
        System.out.println(sql);
        try{
           int berhasil=stmt.executeUpdate(sql);
            System.out.println("berhasil");
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
        return sql;
    }
}
