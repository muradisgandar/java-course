/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class Base {

    private  static int i = 0;
    
    public  static int getI(){
        return i;
    }
    
    public synchronized static void incI(){
        i++;
    }
    
}
