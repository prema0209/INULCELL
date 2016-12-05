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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UsuiTakumi
 */
public class CpControl {
    
    Connection connection=null;
    Statement stmt;
    ResultSet rsCP;
    
    ArrayList<CPagenDB> list =new ArrayList<CPagenDB>();
    String[] title = {"No ID","Nama","No. Hp"};
    int index = 0;
    
    public CpControl(){
        //initComponents();
        
        try {
            connection=DriverManager.getConnection("jdbc:ucanaccess://"
                    +"D:/E-Book/DDPL - Dasar Dasar Pengembangan Perangkat Lunak/INULCELL/inulcell.accdb;","","");
            
            System.out.println("berhasil connect");
            
            stmt= connection.createStatement();
            rsCP=stmt.executeQuery("SELECT * FROM agen");
            
            while(rsCP.next()){
                
                list.add(new CPagenDB( //rsCP.getString("ID") ,
                        rsCP.getString("Nama") ,
                        rsCP.getString("NoHp")));
            }
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
     //   updateTable();
     //   showData();
    }    
    
    public boolean tambah(String nama, String NoHp) { 
        String sql;
        
        CPagenDB newAgen = new CPagenDB();
        newAgen.setNama(nama);
        newAgen.setNohp(NoHp);
        this.list.add(newAgen);
       
        sql = "INSERT INTO Agen (Nama, NoHp) VALUES"
                +"('"+nama+"',"
                + "'"+NoHp+"')";
        
        System.out.println(sql);
        
        try{
           int berhasil=stmt.executeUpdate(sql);    
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
        
        //JOptionPane.showMessageDialog(this, "Data Tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        return true; 
    }
    
    public void lihat(){ 
        String sql;
        sql = "SELECT TOP 35 id,nama,noHp FROM Agen ORDER BY id";
        System.out.println(sql);
        try{
           int berhasil=stmt.executeUpdate(sql);    
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
        }
    }
    
    public boolean hapus(String nama){ 
        String sql;
        sql = "DELETE * FROM agen "
                    + "WHERE nama = '"+nama+"';" ;
        System.out.println(sql);
        
            try{
                int berhasil = stmt.executeUpdate(sql);
            } catch(SQLException errMsg) {
                System.out.println("Ada kesalahan pada SQL, di "+errMsg.getMessage());
            }
        return true; } 
}
