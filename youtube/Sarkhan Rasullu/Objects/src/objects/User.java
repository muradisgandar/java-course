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
public class User {

    private int age;
    private String name;
    private String surname;
    
    public static int a = 0;
    
    {
        System.out.println("Instance block");
    }
    static{
        
        
        System.out.println("Static block");
    }
    
    
    
    public User(){
        this(18);
        
        System.out.println("User 1");
       
    }
    public User(int age){
        this(19,"Murad","Isgandarli");
        
        this.age = age;
        System.out.println("User 2");
    }
    
    public User(int age,String name,String surname){
        this.age = age;
        this.name = name;
        this.surname = surname;
        
        System.out.println("User 3");
    }
    
    public void setAge(int age) {
        if(age>=0){
            this.age= age;
        }
        else{
            System.err.println("Please input valid age!");
            System.exit(1);
            
        }
    }
    public int getAge(){
        return age;
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
    
    
    
    
    
    
}
