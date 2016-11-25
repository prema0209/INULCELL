/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logtransaksi;

/**
 *
 * @author prema
 */
public class ControlLog {
    LogDataBase database;
    
    public ControlLog(){
        
        database=new LogDataBase();
        
    }

    
    public boolean tambahLog(String NoHp, String Provider, String nominal){
        
        
        return true;
    }
    
    public void lihatLog(int awal, int akhir){
        
        
    }
    
    public boolean hapusLog(String Id){
        
        
        return true;
    }
}
