/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logtransaksi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author prema
 */
public class ControlLog {
    
    LogDataBase db;
    Calendar cal;
    SimpleDateFormat format;
    
    public ControlLog(){
        db=new LogDataBase();
        cal = Calendar.getInstance();

        format = new SimpleDateFormat("dd/MM/yyyy");
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
        
        String Tanggal = format.format(cal.getTime());
        int hari=(Integer.parseInt(Tanggal.substring(0, 2)));
        int tahun=(Integer.parseInt(Tanggal.substring(6, 10)))*356;
        int bulan=(Integer.parseInt(Tanggal.substring(3, 5)))*30;
        
        int angka=hari+bulan+tahun;
        
        String sql="Insert Into logtransaksi (Tanggal, NoHp, provider, jumlah, angka) Values"
                +"('"+Tanggal+"',"
                +"'"+NoHp+"',"
                + "'"+Provider+"',"
                + "'"+nominal+"',"
                +"'"+angka+"')";
        
        
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
    
    public Object[][] lihatLog(int index){
       
        
        
        Object[][] data = new Object[15][5];
      
        data = db.LihatLog(index);
        
        
        return data;
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
