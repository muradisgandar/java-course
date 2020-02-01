/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.dto;

import com.company.main.enums.EnumProductKind;
import java.math.BigDecimal;

/**
 *
 * @author murad_isgandar
 */
public class ProductInformDTO {

    private Long id;
    private String name;
    private BigDecimal value;
    private  String prodKindName;
    private EnumProductKind productKind;

    public ProductInformDTO(Long id, String name, BigDecimal value, String prodKindName, EnumProductKind productKind) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.prodKindName = prodKindName;
        this.productKind = productKind;
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

    public String getProdKindName() {
        return prodKindName;
    }

    public void setProdKindName(String prodKindName) {
        this.prodKindName = prodKindName;
    }

    public EnumProductKind getProductKind() {
        return productKind;
    }

    public void setProductKind(EnumProductKind productKind) {
        this.productKind = productKind;
    }

    @Override
    public String toString() {
        return "ProductInformDTO{" + "id=" + id + ", name=" + name + ", value=" + value + ", prodKindName=" + prodKindName + ", productKind=" + productKind + '}';
    }
    
    
    



    
}
