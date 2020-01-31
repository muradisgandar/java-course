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
public enum EnumMeasurementUnit {
    
    PIECE("PIECE"),
    KILO("KILO"),
    LITR("LITR"),
    PORTION("PORTION"),
    PACKET("PACKET");
    
    private final String unit;

    private EnumMeasurementUnit(String unit) {
        this.unit = unit;
    }

    public String getKind() {
        return unit;
    }
    
    
}
