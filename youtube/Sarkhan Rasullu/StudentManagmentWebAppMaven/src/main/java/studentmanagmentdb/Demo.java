/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagmentdb;

import entities.User;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class Demo {

    public static void main(String[] args) {
        
//        User u2 = new User();
//        u2.setName("Fikrət");
//        u2.setAge(25);
//        u2.setPassword("123");
//        u2.setUsername("asasd");
//        u2.setIsAdmin(true);
//        u2.setSurname("testov");
        
        User u = new UserJPA().findUserById(2);
        
        
        System.out.println("u"+u);




    }

}
