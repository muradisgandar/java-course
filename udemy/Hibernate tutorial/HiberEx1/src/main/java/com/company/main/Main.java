/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.main.entities.Pojo;
import com.company.main.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author murad_isgandar
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pojo pojo = new Pojo();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        session.merge(pojo);
        transaction.commit();
        
        
    }
}
