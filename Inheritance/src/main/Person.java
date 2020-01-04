/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author murad_isgandar
 */
public class Person {
    private int age;
    private String name;
    private String surname;
    private Person parent;
    
    public Person(){
        
        
        System.out.println("Hello World");
    }
    
    
    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age: ");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }
    
    
    
    
}
