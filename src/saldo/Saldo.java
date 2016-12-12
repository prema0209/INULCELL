/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldo;




/**
 *
 * @author UsuiTakumi
 */
public class Saldo {
   
        SaldoDB db;
    
    public Saldo(){
            db=new SaldoDB();
    }
    
    /*  apabila melakukan tambah(integer), maka return true
        apabila bukan integer, maka retrun false */
    public boolean tambah(int saldo){
        
        
        String sql;
        
       
        int saldoAwal=Integer.parseInt(lihat());
        
        saldo=saldo+saldoAwal;
        
        sql = "Update Saldo set saldo="
                +"'"+saldo+"'";
        
        
        boolean hasil=db.tambahDb(sql);
    
        return hasil; 
    }
    
    
    public String lihat(){
        
        String saldo=db.LihatSaldo();
        
        
        return saldo;
    }
}
