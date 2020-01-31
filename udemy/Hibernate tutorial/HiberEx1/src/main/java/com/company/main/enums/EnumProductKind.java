/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.enums;

/**
 *
 * @author murad_isgandar
 */
public enum EnumProductKind {
    
    EATABLE("EATABLE"),
    DRINKABLE("DRINKABLE"),
    CLOTHES("CLOTHES"),
    FUEL("FUEL"),
    DAILY_THINGS("DAILY_THINGS");
    
    private final String kind;

    private EnumProductKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
    
    
}
