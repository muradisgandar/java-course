/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.dao;

import com.company.main.entities.Product;
import com.company.main.entities.ProductKind;
import com.company.main.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.query.Query;

/**
 *
 * @author murad_isgandar
 */
public class ProductKindDAO {
    
    private SessionFactory sessionFactory;
    
    public ProductKindDAO(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    public List<ProductKind> findAll(){
        
       Session session =  sessionFactory.openSession();
       
        Query createQuery = session.createQuery("select p from ProductKind p");
        
        return createQuery.list();
    }
    
    public ProductKind findById(Long id){
        
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from ProductKind p where id = :id ");
        query.setParameter("id", id);
        
        return (ProductKind) query.uniqueResult();
        
    }
    
    //MatchMode interface is used for like operation
    public List<ProductKind> findByName(String name, MatchMode matchMode) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from ProductKind p where name like :name ");

        switch (matchMode) {
            case EXACT:
                query.setParameter("name", name);
                break;

            case START:
                query.setParameter("name", name + "%");
                break;

            case END:
                query.setParameter("name", "%" + name);
                break;

            case ANYWHERE:
                query.setParameter("name", "%" + name + "%");
                break;
        }

        return query.list();

    }
    
}
