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
public class ProductKindDTO {
    
    private Long id;
    private String name;
    private BigDecimal maxValue;
    private BigDecimal minValue;
    private Double avarage;
    private Long sumStockAmount;
    private Long countProduct;

    public ProductKindDTO(Long id, String name, BigDecimal maxValue, BigDecimal minValue, Double avarage, Long sumStockAmount, Long countProduct) {
        this.id = id;
        this.name = name;
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.avarage = avarage;
        this.sumStockAmount = sumStockAmount;
        this.countProduct = countProduct;
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

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public BigDecimal getMinValue() {
        return minValue;
    }

    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    public Double getAvarage() {
        return avarage;
    }

    public void setAvarage(Double avarage) {
        this.avarage = avarage;
    }

    public Long getSumStockAmount() {
        return sumStockAmount;
    }

    public void setSumStockAmount(Long sumStockAmount) {
        this.sumStockAmount = sumStockAmount;
    }

    public Long getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(Long countProduct) {
        this.countProduct = countProduct;
    }

    @Override
    public String toString() {
        return "ProductKindDTO{" + "id=" + id + ", name=" + name + ", maxValue=" + maxValue + ", minValue=" + minValue + ", avarage=" + avarage + ", sumStockAmount=" + sumStockAmount + ", countProduct=" + countProduct + '}';
    }
    
    
    
}
