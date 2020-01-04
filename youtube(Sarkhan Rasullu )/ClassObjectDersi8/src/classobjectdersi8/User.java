/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobjectdersi8;

/**
 *
 * @author murad_isgandar
 */
public class User {

    public  String name;
    public  String surname;
    public  int age;
    public static String companyName;

    public static void test1(){
        User user = new User();
        user.name = "dsjkhdkc";
        System.out.println(user.name);
        
    }
    public void test2(){
        User user = new User();
        user.name = "Murad";
        //System.out.println(user.name);
        user.test2();
        
    }
    
}
