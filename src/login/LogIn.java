/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;



public class LogIn {
    
    private LogInDB data;
  
    
    public LogIn(){
        data = new LogInDB();
   
    }
    
    public boolean newUser(String user, String pass){
        String Us=data.ambilData("Select username from login","username");
        String pa=data.ambilData("Select password from login","password");
        
        boolean User=data.gantiData("Update Login set username='"+user+"'");
        boolean Pass=false;
        
        
        if(User){
            
            Pass=data.gantiData("Update Login set password='"+pass+"'");
        }
        else{
            return false;
            
        }
        
        if(Pass){
            
            return true;
        }
        else{
            data.gantiData("Update Login set username='"+Us+"'");
            return false;
        }
           
        
    }
    
    public boolean login(String user, String password){
        
       
            String User=data.ambilData("Select username from login","username");
            String Password=data.ambilData("Select password from login","password");
        
            
            
        if((User.equals(user)) && (Password.equals(password)))
            return true;
        else return false;
        
        
        
    }
}
