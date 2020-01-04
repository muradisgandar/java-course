/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ws.education.bean;

/**
 *
 * @author murad_isgandar
 */
public class User {
    private Integer id;
    private String name;
    private String surname;

    public User(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    
    
    

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
    
    
}
