/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.main.dao.ProductKindDAO;
import com.company.main.entities.Product;
import com.company.main.entities.ProductKind;
import com.company.main.services.ProductKindService;
import com.company.main.services.ProductService;
import com.company.main.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    public static void main(String[] args) {
        
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        
//        session.merge(new Product());
//        session.merge(new ProductKind());
//        transaction.commit();

//        ProductService productService = new ProductService();
//        
//        List<Product> prod = productService.findByName("EATABLE", MatchMode.EXACT);
//        prod.forEach(p->System.out.println(p.getName()));
        
        
        ProductKindService productKindService = new ProductKindService();
        
        List<ProductKind> prod = productKindService.findByName("E", MatchMode.START);
        prod.forEach(p->System.out.println(p.getName()));
        

    }
}
