/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;
import menuawal.MenuAwal;


public class LogIn {
    
    private LogInDB data;
  //  private boolean hasil;
    private MenuAwal menu;
    
    public LogIn(){
        data = new LogInDB();
        menu = new MenuAwal();
    }
    
    public void newUser(String user, String pass){
        data.setUser(user);
        data.setPass(pass);
    }
    
    public boolean login(String user, String password){
        return data.CekUserPass(user, password);
    }
}
