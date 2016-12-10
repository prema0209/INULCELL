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
        int untung=0;
        
        String Tanggal = format.format(cal.getTime());
        int hari=(Integer.parseInt(Tanggal.substring(0, 2)));
        int tahun=(Integer.parseInt(Tanggal.substring(6, 10)))*365;
        int bulan=(Integer.parseInt(Tanggal.substring(3, 5)))*30;
        
        int angka=hari+bulan+tahun;
        int pokok=0;
    
        
        if(nominal.equals("5.000")){
            untung=1000;
            pokok=5500;
            
        }
        else if(nominal.equals("10.000")){
            untung=1100;
            pokok=10400;
            
        }
        else if(nominal.equals("25.000")){
            untung=1500;
            pokok=25000;
        }
        else if(nominal.equals("50.000")){
            untung=2500;
            pokok=49000;
            
        }else if(nominal.equals("100.000")){
            untung=3500;
            pokok=98000;
        }
        
        
        String sql="Insert Into logtransaksi (Tanggal, NoHp, provider,nominal, untung, angka) Values"
                +"('"+Tanggal+"',"
                +"'"+NoHp+"',"
                + "'"+Provider+"',"
                + "'"+nominal+"',"
                + "'"+untung+"',"
                +"'"+angka+"')";
        
        
        boolean saldo=false;
        boolean tambah=false;
        
        
        
        saldo=db.kurangSaldo(pokok);
        
        if(saldo){
            
            tambah=db.tambahLog(sql);
        }
        
        if(!(tambah)){
            pokok=pokok*-1;
            saldo=db.kurangSaldo(pokok);
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
