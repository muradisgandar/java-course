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
public class Person {
    
    public String name;
    public String surname;
    public Integer age;

    public String city;
//    public Person() {
//        
//    }
    
    
    
//    public Person(String name,String surname,Integer age){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }
    
    
    public  void personMethod() {
        System.out.println("PersonMethod is called");
        
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public Integer getAge() {
        return age;
    }

    
    
    
    
}
