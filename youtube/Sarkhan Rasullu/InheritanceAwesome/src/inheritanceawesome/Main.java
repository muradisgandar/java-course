/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceawesome;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();
        
        
        Person p2 = s;
        Student s2 = (Student)p;
        
        

    }


}
