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
    
    public ControlLog(){
       
    }

    /*  Yang penting User telah memasukkan apa pun di text no hp -> true
        Apabila User tidak memasukkan no hp ("") -> false
    */
    public boolean tambahLog(String NoHp, String Provider, String nominal){
        return !"".equals(NoHp);
    }
    
    public void lihatLog(int awal, int akhir){
        
    }
    
    /*  Yang penting User telah memasukkan apa pun di text id -> true
        Apabila User tidak memasukkan id ("") -> false
    */
    public boolean hapusLog(String Id){
        return !"".equals(Id);
}
}
