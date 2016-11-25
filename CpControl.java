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
public class CpControl {
    private CPagenDB data;
    
    public CpControl(){
        data = new CPagenDB();
    }
    
    /*  Yang penting User telah memasukkan nama.
        Apabila User telah memasukkan nama dan no hp -> true
        Apabila User telah memasukkan nama tanpa no hp -> true
        Apabila User telah memasukkan no hp tanpa nama -> false
        Apabila User tidak memasukkan nama dan no hp -> false
    */
    public boolean tambah(String nama, String NoHp) {
        return !"".equals(nama);//||!"".equals(NoHp);
    }
    
    public void lihat(){
        
    }
    
    public boolean hapus(String nama){
        return !"".equals(nama);
    } 
}
