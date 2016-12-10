/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

public class LogInDB {
    
    private String User;
    private String Pass;
    
    public LogInDB(){
        
    }
 public LogInDB(String username, String password)
    {
    this.User = username;
    this.Pass = password;
    }
    
    public void connectDb(){
        
    }
    
    public boolean CekUserPass(String User, String Pass){
        return Pass.contains("admin") && User.contains("admin");
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
}
