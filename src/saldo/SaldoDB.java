/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldo;

/**
 *
 * @author UsuiTakumi
 */
public class SaldoDB {
    private int nominal;
    
    public SaldoDB(int nominal){
        this.nominal = nominal;
    }
    
    public void connectDB(){
        
    }
    
    public boolean tambah() {
        return true;
    }
    
    public void lihat(){
        
    }

    /**
     * @return the nominal
     */
    public int getNominal() {
        return nominal;
    }

    /**
     * @param nominal the nominal to set
     */
    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
    
}
