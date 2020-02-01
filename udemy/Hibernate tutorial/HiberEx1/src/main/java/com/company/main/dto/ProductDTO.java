/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.dto;

import java.math.BigDecimal;

/**
 *
 * @author murad_isgandar
 */
public class ProductDTO {
    
    private Long id;
    private String name;
    private BigDecimal value;

    public ProductDTO(Long id, String name, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
    
    
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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
    
    
}
