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
        
        
        
        String sql="Insert Into logtransaksi (NoHp, provider, jumlah) Values"
                +"('"+NoHp+"',"
                + "'"+Provider+"',"
                + "'"+nominal+"')";
        
        
        boolean saldo=true;
        
        boolean tambah=db.tambahLog(sql);
        if(tambah){
            saldo=db.kurangSaldo(nominal);
        }
        
        if(tambah && saldo){
            return true;
        }
        else return false;
    }
    
    public void lihatLog(int awal, int akhir){
        
        
    }
    
    public boolean hapusLog(String Id){
        
        String sql="delete from logtransaksi "
                +"where id='"+Id+"'"; 
        
        boolean hapus=db.hapusLog(sql);
        
        if(hapus){
            return true;
        }
        else return false;
       
    }
}