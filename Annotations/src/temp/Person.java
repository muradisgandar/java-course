/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import myannotation.MyAnnotationField;
import myannotation.MyAnnotationClass;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author murad_isgandar
 */
//@MyAnnotationClass
public class Person {

    @MyAnnotationField(name = "BSP TECH")
    private String companyName;
    
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Person(){
        try {
            AnnotationUtil.start(this);
        } catch (Exception ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    

}
