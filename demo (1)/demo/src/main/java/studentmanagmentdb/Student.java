/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagmentdb;

/**
 *
 * @author murad_isgandar
 */
public class Student {
    private String id;
    private String name;
    private String surnname;
    private Integer age;

    public Student() {
    }

    public Student(String id, String name, String surnname, Integer age) {
        this.id = id;
        this.name = name;
        this.surnname = surnname;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surnname;
    }

    public void setSurnname(String surnname) {
        this.surnname = surnname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surnname=" + surnname + ", age=" + age + '}';
    }

    
    
     
    
}
