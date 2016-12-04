/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rekapdata;

/**
 *
 * @author prema
 */
public class RekapControl {
    
    RekapDB db;
    
    public RekapControl(){
        db=new RekapDB();
        
    }
    
    public String Harian(int a, int b){
        int awal=0;
        int akhir=0;
        String sql="";
        
        if(b==2){
            //jumlah transaksi
            
            sql="SELECT count(id) from logtransaksi where tanggal='"+a+"'";
           
             
            
            
        }
        else if(b==3){
            //provider juara
            
            
        }
        else{
            //Keuntungan
            
            
        }
        
        return "";
    }
    
    public String Mingguan(int a, int b){
         String x="0";
        
        return x;
    }
    
    public String Bulanan(int a, int b){
         String x="0";
        
        return x;
    }
}
