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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logtransaksi.LogDataBase;

/**
 *
 * @author UsuiTakumi
 */
public class CpControl {
    
    private CPagenDB db;
    /*
    Connection connection=null;
    Statement stmt;
    ResultSet rsCP;
    
    ArrayList<CPagenDB> list =new ArrayList<CPagenDB>();
    String[] title = {"No ID","Nama","No. Hp"};
    int index = 0;*/
    
    public CpControl(){
        db = new CPagenDB();
    }    
    
    public boolean tambah(String nama, String NoHp) { 
        String sql;
       
        sql = "INSERT INTO Agen (Nama, NoHp) VALUES"
                +"('"+nama+"',"
                + "'"+NoHp+"')";
        
        System.out.println(sql);
        
        boolean tambah=db.tambah(sql);
        return true;
    }
    
    public Object[][] lihat(int index){ 
       Object[][] data = new Object[15][5];
        data = db.lihat(index);
        return data;
    }
    
    public boolean hapus(String id){ 
        String sql="delete from agen "
                +"where id='"+id+"'"; 
        
        boolean hapus=db.hapus(sql);
        
        if(hapus){
            return true;
        }
        else return false; 
    } 
}