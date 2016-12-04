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
    
    LogDataBase db;
    
    public ControlLog(){
        db=new LogDataBase();
        
    }

    public boolean cek(String NoHp){
        try{
            
                if(NoHp.length()>9){
                    if((NoHp.substring(0,1)).equals("0") || (NoHp.substring(0,2)).equals("62") ){
                         long tes=Long.parseLong(NoHp);
                            return true;
                    }
                    return false;
                }
                else{
                    return false;
                }
            
        }
        catch(NumberFormatException e){
                return false;
        }
    }
    public boolean tambahLog(String NoHp, String Provider, String nominal){
        System.out.print(Provider);
        String sql="Insert Into logtransaksi (NoHp, provider, jumlah) Values"
                +"('"+NoHp+"',"
                + "'"+Provider+"',"
                + "'"+nominal+"')";
        
        db.tambahLog(sql, nominal);
        db.kurangSaldo(nominal);
        return true;
    }
    
    public void lihatLog(int awal, int akhir){
        
        
    }
    
    public boolean hapusLog(String Id){
        
        
        return true;
    }
}
