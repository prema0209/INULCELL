/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rekapdata;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author prema
 */
public class RekapControl {
    
    RekapDB db;
    Calendar cal;
    SimpleDateFormat format;
    String hasil;
    
    public RekapControl(){
        db=new RekapDB();
        cal = Calendar.getInstance();
        hasil="hai";
        format = new SimpleDateFormat("dd/MM/yyyy");
        
    }
    
    public String Harian(int a, int b){
        
        String sql="";
        String Tanggal = format.format(cal.getTime());
        String Tanggal2="";
        
        int ganti=Integer.parseInt(Tanggal.substring(0, 2));
        
        int ganti2=ganti;
        
        int bulan=Integer.parseInt(Tanggal.substring(3, 5));
        if(ganti-a>0){
           ganti=ganti-a;
        }
        
       
        else{
            
            
            if(bulan>7){
                if(bulan%2!=0)ganti=31-a+ganti2;
                else ganti=30-a+ganti2;
            }
            else if(bulan==7)ganti=31-a+ganti2;
            else {
                
                if(bulan%2!=0)ganti=30-a+ganti2;
                else ganti=31-a+ganti2;
            }
            bulan=bulan-1;
            
        }
        
      
        
        
        if(ganti<10){
            Tanggal2=("0"+Integer.toString(ganti))+"/"+(Integer.toString(bulan))+Tanggal.substring(5,10);
        }
        else{
            Tanggal2=(Integer.toString(ganti))+"/"+(Integer.toString(bulan))+Tanggal.substring(5,10);
        }
        
        
        
        if(b==2){
            //jumlah transaksi
            
            
            
            sql="SELECT count(id) as data from logtransaksi where tanggal='"+Tanggal2+"'";
            
             
             
            hasil=db.ambilData(sql);
            
            
            return hasil;
            
            
        }
        else if(b==3){
            //provider juara
            int test=0;
            String hitung="";
            
            String provider[][]=new String[8][2];
            
            provider[0][0]="Telkomsel";
            provider[1][0]="simpati";
            provider[2][0]="AS";
            provider[3][0]="Mentari";
            provider[4][0]="XL";
            provider[5][0]="3";
            provider[6][0]="im3";
            
            int banyak=0;
            
            for(int i=0;i<7;i++){
                sql="SELECT count(provider) as data from logtransaksi where provider='"+provider[i][0]+"' and tanggal='"+Tanggal2+"'";
                
                hitung=db.ambilData(sql);
                
                test=Integer.parseInt(hitung);
                
                if(test>banyak)hasil=provider[i][0];
                
                
            }
            
            
           
       
            
            return hasil;
        }
        else{
            //Keuntungan
            
            sql="SELECT sum(jumlah) as data from logtransaksi where tanggal='"+Tanggal2+"'";
            
            String hasil=db.ambilData(sql);
            
            return hasil;
            
        }
        
        
    }
    
    public String Mingguan(int a, int b){
        String x="";
        String sql="";
        
        int pengurang=0;
        
       SimpleDateFormat format1 = new SimpleDateFormat("EE");
        String Tanggal = format1.format(cal.getTime());
        
        if(Tanggal.equals("Sel")){
            pengurang=1;
        }
        else if(Tanggal.equals("Rab")){
            pengurang=2;
        }
        else if(Tanggal.equals("Kam")){
            pengurang=3;
        }
        else if(Tanggal.equals("Jum")){
            pengurang=4;
        }
        else if(Tanggal.equals("Sab")){
            pengurang=5;
        }
        else if(Tanggal.equals("Min")){
            pengurang=6;
        }
        
      
        
        Tanggal = format.format(cal.getTime());
        
        int tahun=(Integer.parseInt(Tanggal.substring(6, 10)))*365;
        int bulan=(Integer.parseInt(Tanggal.substring(3, 5)))*30;
        int hari=(Integer.parseInt(Tanggal.substring(0, 2)));
        
        
        
        int Tanggal1=0;
        int Tanggal2=tahun+bulan+hari-(7*a);
        
        if((hari-pengurang)<0){
            if(bulan<7){
                if(bulan<2){
                    tahun=tahun-365;
                    if(pengurang<31){
                        
                        
                        
                        bulan=12*30;
                        hari=hari-pengurang+31;
                    }
                    else{
                        bulan=11*30;
                        hari=hari-pengurang+30;
                    }
                }
                else{
                    
                    
                    
                    if(bulan%2!=0){
                        hari=hari-pengurang+31;
                    }
                    else{
                        hari=hari-pengurang+30;
                    }
                    bulan=bulan-30;
                }
                
            }
            else if(bulan==7){
                bulan=bulan-30;
                hari=hari-pengurang+31;
                
            }
            else if(bulan>7){
                 if(bulan%2!=0){
                        hari=hari-pengurang+30;
                    }
                    else{
                        hari=hari-pengurang+31;
                    }
                    bulan=bulan-30;
                
            }
            
        }
        
        Tanggal1=hari+bulan+tahun-pengurang-(7*(a+1));
        
        
       
       
        
        if(b==2){
            //jumlah transaksi
            
            
            
            sql="SELECT count(id) as data from logtransaksi where angka between "+Tanggal1+" and "+Tanggal2+"";
           
             
             
            hasil=db.ambilData(sql);
            
            
            
            
            
            return hasil;
            
            
        }
        else if(b==3){
            //provider juara
            int test=0;
            String hitung="";
            
            String provider[][]=new String[8][2];
            
            provider[0][0]="Telkomsel";
            provider[1][0]="simpati";
            provider[2][0]="AS";
            provider[3][0]="Mentari";
            provider[4][0]="XL";
            provider[5][0]="3";
            provider[6][0]="im3";
            
            int banyak=0;
            
            
    
            for(int i=0;i<7;i++){
                sql="SELECT count(provider) as data from logtransaksi where angka between "+Tanggal1+" and "+Tanggal2+" and provider='"+provider[i][0]+"'";
                
                hitung=db.ambilData(sql);
                
                test=Integer.parseInt(hitung);
               
                
                
                if(test>banyak){hasil=provider[i][0];
                        banyak=test;
                }
                
                
            }
            
            
           
       
            
            return hasil;
        }
        else{
            //Keuntungan
            
            sql="SELECT sum(jumlah) as data from logtransaksi where angka between "+Tanggal1+" and "+Tanggal2+"";
            
            String hasil=db.ambilData(sql);
            
            return hasil;
            
        }
    }
    
    public String Bulanan(int a, int b){
        String sql="";
        
        String Tanggal = format.format(cal.getTime());
        int Tanggal1=0;
        int Tanggal2=0;
        
      
        
      
        int tahun=(Integer.parseInt(Tanggal.substring(6, 10)))*365;
        int bulan=(Integer.parseInt(Tanggal.substring(3, 5)))*30;
        
        if(bulan-a>0)bulan=bulan-(a*30);
        else{
            bulan=bulan-a+12;
            tahun--;   
            
        }
        
       
        
        if(bulan>7){
            if(bulan%2!=0){
                Tanggal2=31+bulan+tahun;
            }
            else Tanggal2=30+bulan+tahun;
     
        }
        else if (bulan==7)Tanggal2=31+bulan+tahun;
        
        else{
            if(bulan%2!=0){
                Tanggal2=30+bulan+tahun;
            }
            else Tanggal2=31+bulan+tahun;
            
        }
        
        
        Tanggal1=1+bulan+tahun;
        
        if(b==2){
            //jumlah transaksi
            
            
            
            sql="SELECT count(id) as data from logtransaksi where angka between "+Tanggal1+" and "+Tanggal2+"";
           
             
            hasil=db.ambilData(sql);
            
            
            
            
            
            return hasil;
            
            
        }
        else if(b==3){
            //provider juara
            int test=0;
            String hitung="";
            
            String provider[][]=new String[8][2];
            
            provider[0][0]="Telkomsel";
            provider[1][0]="simpati";
            provider[2][0]="AS";
            provider[3][0]="Mentari";
            provider[4][0]="XL";
            provider[5][0]="3";
            provider[6][0]="im3";
            
            int banyak=0;
            
            
    
            for(int i=0;i<7;i++){
                sql="SELECT count(provider) as data from logtransaksi where angka between "+Tanggal1+" and "+Tanggal2+" and provider='"+provider[i][0]+"'";
                
                hitung=db.ambilData(sql);
                
                test=Integer.parseInt(hitung);
               
                
                if(test>banyak){hasil=provider[i][0];
                        banyak=test;
                }
                
                
            }
            
            
           
       
            
            return hasil;
        }
        else{
            //Keuntungan
            
            sql="SELECT sum(jumlah) as data from logtransaksi where angka between "+Tanggal1+" and "+Tanggal2+"";
            
            String hasil=db.ambilData(sql);
            
            return hasil;
            
        }
     
        
        
        }
    
}

