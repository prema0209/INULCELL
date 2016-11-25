/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpagen;

/**
 *
 * @author UsuiTakumi
 */
public class CPagenDB {
    private CPagenLihat lihat;
    
    private String no;
    private String nama;
    private String nohp;
    
    public CPagenDB(){
        
    }
    
    public CPagenDB(String no, String nama, String nohp){
        this.no = no;
        this.nama = nama;
        this.nohp = nohp;
    }
    
    public void connectDB(){
        
    }
    
    public boolean tambah(String nama, String NoHp) {
        return false;
    }
    
    public void lihat(){
        
    }
    
    public boolean hapus(int ID){
        return false;
    } 

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nohp
     */
    public String getNohp() {
        return nohp;
    }

    /**
     * @param nohp the nohp to set
     */
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
