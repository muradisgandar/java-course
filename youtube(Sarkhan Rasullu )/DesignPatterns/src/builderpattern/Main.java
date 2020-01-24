/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import builderpattern.Fanar.FanarBuilder;
import builderpattern.Lampa;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        FanarBuilder builder = Fanar.builder();//bu da geriye fanarbuilder obyecti return edir
        
        FanarBuilder builder1 = new Fanar.FanarBuilder();//bu da hemchinin(burada builder classi nested olduguna gore objecti bele yaranir)
        
        builder1.setName("name");
        builder1.setL(new Lampa());
        
        
        Fanar l = builder1.build();
        
        
        System.out.println(l.getName());

    }
    
}
