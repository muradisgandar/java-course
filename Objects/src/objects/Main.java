/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;


/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       // Class.forName("objects.User");
     Scanner sc = new Scanner(System.in);
        
        System.out.println("How many users will be?");
        int a = sc.nextInt();
        
        User[] users = new User[a];
        
        for(int i=0;i<users.length;i++){
            User user = new User();
            
            System.out.println("Age: ");
            user.setAge(sc.nextInt());
            
            sc.nextLine();
            
            System.out.println("Name: ");
            user.setName(sc.nextLine());
            
            
            System.out.println("Surname: ");
            user.setSurname(sc.nextLine());
            
            users[i] = user;
            
        }
        Util.printUsers(users);
        

        
        
//User a1 = new User(18);
//User b = new User(18,"Murad","Isgandarli");

    }

}
