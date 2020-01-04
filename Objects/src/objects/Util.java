/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author murad_isgandar
 */
public class Util {
    public static void  printUser(User u){
        

        System.out.println(u.getAge());
        System.out.println(u.getName());
        System.out.println(u.getSurname());
        
      
    }
    public static void printUsers(User[] users){
        for(int i=0;i<users.length;i++){
            User a = users[i];
            printUser(a);
            
        }
        
        
    }
    
    
    
    
    
    
    
    
}
