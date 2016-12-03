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

/**
 *
 * @author UsuiTakumi
 */
public class CpControl {
    
    Connection connection=null;
    Statement stmt;
    ResultSet rsCP;
    
    ArrayList<CPagenDB> list =new ArrayList<CPagenDB>();
    String[] title = {"ID","Nama","NoHp"};
    int index = 0;
    
    public CpControl(){
        //initComponents();
        
        try {
            connection=DriverManager.getConnection("jdbc:ucanaccess://"
                    +"D:/E-Book/DDPL - Dasar Dasar Pengembangan Perangkat Lunak/INULCELL;","","");
            
            System.out.println("berhasil"); //buat informasi
            
            stmt= connection.createStatement();
            rsCP=stmt.executeQuery("SELECT * FROM cpagendb");
            
            while(rsCP.next()){
                
                list.add(new CPagenDB( rsCP.getString("ID") ,
                        rsCP.getString("Nama") ,
                        rsCP.getString("NoHp")));
            }
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage()); // buat informasi
        }
    }
    
    public boolean tambah(String nama, String NoHp) { return true; }
    
    public void lihat(){ }
    
    public boolean hapus(String nama){ return true; } 
}
