/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    public static void main(String[] args) throws Exception {

//        Method [] arr = Person.class.getDeclaredMethods();
//        for(Method m:arr){
//            System.out.println(m);
//            
//            Annotation[] ann = m.getDeclaredAnnotations();
//            for(Annotation a:ann){
//                System.out.println(a);
//            }
//            
//            
//        }
//        Person p = new Person();
//
//        System.out.println(p.getCompanyName());
        Person p = new Person();
        Field[] f = Person.class.getDeclaredFields();
        for (Field a : f) {
            a.setAccessible(true);
            System.out.println(a);
            Object obj = a.get(p);
            if (obj == null) {
                a.set(p, "Salam");
                System.out.println(p.getName());
                System.out.println(a.get(p));

            }

        }

    }

}
