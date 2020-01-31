/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.utils;

import com.company.main.entities.Product;
import com.company.main.entities.ProductKind;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author murad_isgandar
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try {

            Configuration cfg = new Configuration();
            SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

//            cfg.addAnnotatedClass(Pojo.class);//second way for mapping(amma mende ishelmedi bu usul(versiya ferqi zad ola biler))
            //1 st way in xml 
            
            return sessionFactory;

        } catch (Exception e) {

            System.out.println("SessionFactory isn't created by some problem" + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
