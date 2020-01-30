/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author murad_isgandar
 */
@Entity
@Table(name = "POJO_TABLE")
public class Pojo {
    
    @SequenceGenerator(name = "seq",sequenceName = "POJO_TABLE_ID_SEQ",allocationSize = 1)// for generating any order sequence(this case ascending order =  1) for ascending primary id
    //if we don't define any order , default ascending order is equal 50 
    //if we write allocationSize = 1, initialValue = 100  order begins 100  and ascends up by 1
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    private Long id;

    private String name;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
