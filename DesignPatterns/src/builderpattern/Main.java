/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import builderpattern.Fanar;
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
        // TODO code application logic here
        Fanar.FanarBuilder builder = Fanar.builder();
        
        builder.setName("name");
        builder.setL(new Lampa());
        
        
        Fanar l = builder.build();
        
        
        System.out.println(l.getName());
    }
    
}
