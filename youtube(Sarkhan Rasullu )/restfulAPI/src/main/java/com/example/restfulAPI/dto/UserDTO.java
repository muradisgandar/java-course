/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulAPI.dto;

/**
 *
 * @author murad_isgandar
 */
public class UserDTO {
    private  Integer id;
    private  String name;
    private  String surname;
    private  String username;
    private  Integer age;
    private boolean enabled;
    
    public UserDTO() {
    }

    public UserDTO(Integer id, String name, String surname, String username, Integer age, boolean enabled) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.age = age;
        this.enabled = enabled;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        System.out.println("name method is called");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        System.out.println("surname method is called");
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    
    
    
}
