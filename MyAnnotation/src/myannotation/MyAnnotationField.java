/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myannotation;

/**
 *
 * @author murad_isgandar
 */
import java.lang.annotation.*;

@Target(value = {ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotationField {
    
    String name() default "";
}
