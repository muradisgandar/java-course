/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import Cars.*;
import beans.*;
import Bycicles.*;
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
        
        
        BMW b = new BMW();
        Mercedes m = new Mercedes();
        b.drive(100);
        
//        Chargeable c = (Chargeable)m;
//        Bycicle bb = (Bycicle)b;
        
    }
    public static void driveable(Driveable d){
        
    }
    
}
