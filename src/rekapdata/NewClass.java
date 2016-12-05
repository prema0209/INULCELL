/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapdata;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import static javax.print.attribute.Size2DSyntax.MM;

/**
 *
 * @author prema
 */
public class NewClass {
    
    public static void main(String args[]){
        
     Calendar cal = Calendar.getInstance();
int pengurang=0;
    SimpleDateFormat contoh1 = new SimpleDateFormat("EE");
   
   
    cal.add(Calendar.DATE, 3);
    
     String Tanggal = contoh1.format(cal.getTime());
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
    System.out.println(pengurang+", "+Tanggal);
  
        
        
        
    }
}
