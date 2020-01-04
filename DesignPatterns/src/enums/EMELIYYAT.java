/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author murad_isgandar
 */

//QEYD: Enumlar java 1.5 den sonra gelib

public enum EMELIYYAT {
    TOPLA('+'), VUR('*'), CHIX('-'), BOL('/');

    /*
    Arxada bu shekilde declare olunurlar:
    
    public static final EMELIYYAT TOPLA = new EMELIYYAT('+')
    public static final EMELIYYAT CHIX = new EMELIYYAT('-')
    public static final EMELIYYAT VUR = new EMELIYYAT('*')
    public static final EMELIYYAT BOL = new EMELIYYAT('/')
     */
    private char c;

//    EMELIYYAT() {
//
//    }
    EMELIYYAT(char c) {
        this.c = c;
    }

    public char getOperatonSymbol() {
        return this.c;
    }

    public double hesabla(double a, double b) {
        if (c == '+') {
            return a + b;
        }
        return -1;
    }

}
