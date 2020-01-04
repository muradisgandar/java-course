/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherstudent;

/**
 *
 * @author murad_isgandar
 */
public class Student {
    private int age;
    private String name;
    private String surname;
    
    public void setAge(int age){
        this.age =age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    
}
