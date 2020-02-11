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
public class Student extends Person{
    
    public String email;

    public Student() {
        this("Murad", "Isgandarli", 19);
    }
    
    
  
    public Student(String name,String surname,Integer age){
//        super(name, surname, age);
    } 
    
    
    public  void studentMethod() {
        System.out.println("StudentMethod is called");
    }
    
    public  void personMethod() {
        System.out.println("PersonMethod is called in Student");
    }
    
    public  void personMethodInPerson() {
        super.personMethod();
    }
    
    
}
