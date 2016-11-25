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
public class LogDataBase {
    LihatLog lihat;
    
    public LogDataBase(){
        lihat=new LihatLog();
    }
    
    
    public void connectDB(){
        
    }
    
    public boolean tambahLog(String NoHp, String Provider, int nominal){
        
        
        return false;
    }
    
    public void LihatLog(){
        
        
        
    }
    
    public boolean hapusLog(int NoID) {
        
        
        return false;
    }
}
