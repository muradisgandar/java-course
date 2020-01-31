/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.dao;

import com.company.main.entities.Product;
import com.company.main.enums.EnumMeasurementUnit;
import com.company.main.utils.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

    public List<Product> findAllWithOrder() {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p order by stockAmount , name");

        return query.list();
    }
    
    public List<Product> findAllWithOrderByLimit(int maxResult) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p order by stockAmount desc , name asc");
        query.setMaxResults(maxResult);//for limitiation for examp: if maxResult = 3 then only 3 data will be fetched
        

        return query.list();
    }
    
    public List<Product> findAllByRecentUsageDate(Date date) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p where recentUsageDate >= :recentUsageDate");
        query.setParameter("recentUsageDate", date);
        

        return query.list();
    }
    
    public Long sumStockAmountbyProductTypeId(Long productTypeId){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select sum( stockAmount) from Product p where productKind.id = :id ");
        query.setParameter("id", productTypeId);
        
        return (Long)query.uniqueResult();
        
    }
    
    public Long countProductbyProductTypeId(Long productTypeId){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select count( p) from Product p where productKind.id = :id ");
        query.setParameter("id", productTypeId);
        
        return (Long)query.uniqueResult();
        
    }
    
    public List<EnumMeasurementUnit> findAllUnits(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select distinct( unit) from Product p ");//for fetching different units
        
        return query.list();
    }

    public Double findAvgStockAmount(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select avg( stockAmount) from Product p ");
        
        return (Double) query.uniqueResult();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
