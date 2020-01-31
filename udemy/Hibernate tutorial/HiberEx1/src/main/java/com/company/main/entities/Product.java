/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.entities;

import com.company.main.enums.EnumMeasurementUnit;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author murad_isgandar
 */
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(generator = "product", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "product", sequenceName = "PRODUCT_ID_SEQ",initialValue = 1)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "value",precision = 15,scale = 2)
    private BigDecimal value;

    @Temporal(TemporalType.DATE)
    @Column(name = "recentUsageDate")
    private Date recentUsageDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productkind_id",foreignKey = @ForeignKey(name = "FK_PRODUCT_PRODUCT_KIND"))
    private ProductKind productKind;

    @Column(name = "STOK_AMOUNT")
    private Long stockAmount;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT",length = 30)
    private EnumMeasurementUnit unit;

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

    public Date getRecentUsageDate() {
        return recentUsageDate;
    }

    public void setRecentUsageDate(Date recentUsageDate) {
        this.recentUsageDate = recentUsageDate;
    }

    public ProductKind getProductKind() {
        return productKind;
    }

    public void setProductKind(ProductKind productKind) {
        this.productKind = productKind;
    }

    public Long getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Long stockAmount) {
        this.stockAmount = stockAmount;
    }

    public EnumMeasurementUnit getUnit() {
        return unit;
    }

    public void setUnit(EnumMeasurementUnit unit) {
        this.unit = unit;
    }
    
    
    
}
