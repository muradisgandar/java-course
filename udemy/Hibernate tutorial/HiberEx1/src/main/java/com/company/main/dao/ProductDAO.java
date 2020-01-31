/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.dao;

import com.company.main.entities.Product;
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
public class ProductDAO {

    private SessionFactory sessionFactory;

    public ProductDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Product> findAll() {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p");

        return query.list();
    }

    public Product findById(Long id) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p where id = :id ");
        query.setParameter("id", id);

        return (Product) query.uniqueResult();

    }

    public List<Product> findAllProductBetweenStockAmountMaxAndMin(Long min, Long max) {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p where stockAmount <= :max "
                + " and stockAmount >= :min");

        query.setParameter("max", max);
        query.setParameter("min", min);

        return query.list();
    }

    public List<Product> findAllProductBetweenStockAmountMaxAndMin2(Long min, Long max) {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p where stockAmount between :min and :max");

        query.setParameter("max", max);
        query.setParameter("min", min);

        return query.list();
    }

    

}
