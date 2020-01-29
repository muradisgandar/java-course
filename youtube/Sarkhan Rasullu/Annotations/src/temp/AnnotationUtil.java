/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import myannotation.MyAnnotationField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 *
 * @author murad_isgandar
 */
public class AnnotationUtil {

    public static void start(Person p) throws Exception {
        Field[] fileds = Person.class.getDeclaredFields();
        for (Field f : fileds) {
            Annotation[] annotations = f.getDeclaredAnnotations();
            for (Annotation a : annotations) {
                if (a instanceof MyAnnotationField) {
                    MyAnnotationField myAnn = (MyAnnotationField) a;
                    f.setAccessible(true);
                    Object obj = f.get(p);
                    if (obj == null) {
                        f.set(p, myAnn.name());
                    }
                }
            }
        }
    }
}
