/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpagen;



/**
 *
 * @author UsuiTakumi
 */
public class CpControl {
    
    private CPagenDB db;
   
    
    public CpControl(){
        db = new CPagenDB();
    }    
    
    public boolean tambah(String nama, String NoHp) { 
        String sql;
       
        sql = "INSERT INTO Agen (Nama, NoHp) VALUES"
                +"('"+nama+"',"
                + "'"+NoHp+"')";
        
        
        
        boolean tambah=db.tambah(sql);
        return true;
    }
    
    public Object[][] lihat(int index){ 
       Object[][] data = new Object[15][3];
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