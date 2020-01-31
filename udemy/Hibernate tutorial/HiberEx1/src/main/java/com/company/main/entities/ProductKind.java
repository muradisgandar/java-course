/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.entities;

import com.company.main.enums.EnumProductKind;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author murad_isgandar
 */
@Entity
//@Table("PRODUCT_KIND")
public class ProductKind {
    
    @Id
    @GeneratedValue(generator = "productkind",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "productkind",sequenceName = "PRODUCT_KIND_ID_SEQ",initialValue = 1)
    private Long id;
    
    @Column(name = "name",length = 100)
    private String name;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "kind",length = 30)
    private EnumProductKind enumProductKind;
    
    @OneToMany(targetEntity = Product.class,mappedBy = "productKind")
    private Set products = new HashSet();

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

    public EnumProductKind getEnumProductKind() {
        return enumProductKind;
    }

    public void setEnumProductKind(EnumProductKind enumProductKind) {
        this.enumProductKind = enumProductKind;
    }


    public Set getProducts() {
        return products;
    }

    public void setProducts(Set products) {
        this.products = products;
    }
    
    
            
}
