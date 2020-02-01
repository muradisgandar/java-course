/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.dao;

import com.company.main.dto.ProductDTO;
import com.company.main.dto.ProductInformDTO;
import com.company.main.entities.Product;
import com.company.main.enums.EnumMeasurementUnit;
import com.company.main.utils.HibernateUtil;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
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
    
    public List<Product> findAllWithCriteria() {// hazir JPA metodlari istifade ederek jpql(hql) sorgular yazmayacayiq 

        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);
        
        query.from(Product.class);
        
        
        return session.createQuery(query).getResultList();
    }

    public Product findById(Long id) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p where id = :id ");
        query.setParameter("id", id);

        return (Product) query.uniqueResult();

    }
    
    public Product findByIdWithCriteria(Long id) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);
        
        Root<Product> root = query.from(Product.class);
        query.select(root).where(
                criteriaBuilder.equal(root.get("id"),id)
        );
        
        return session.createQuery(query).uniqueResult();
        
        // above code is equavialent with below one
        
//        Product prod = session.find(Product.class, id);
//        return prod;
        
    }

    public List<Product> findAllProductBetweenStockAmountMaxAndMin(Long min, Long max) {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p where stockAmount <= :max "
                + " and stockAmount >= :min");

        query.setParameter("max", max);
        query.setParameter("min", min);

        return query.list();
    }
    
    public List<Product> findAllProductBetweenStockAmountMaxAndMinWithCriteria(Long min, Long max) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);
        
        Root<Product> root = query.from(Product.class);
//        query.select(root).where(
//               criteriaBuilder.between(root.get("stockAmount"), min, max)
//        );
//        
//        
//        return session.createQuery(query).list();
        return null;
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

    public Long sumStockAmountbyProductTypeId(Long productTypeId) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select sum( stockAmount) from Product p where productKind.id = :id ");
        query.setParameter("id", productTypeId);

        return (Long) query.uniqueResult();

    }

    public Long countProductbyProductTypeId(Long productTypeId) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select count( p) from Product p where productKind.id = :id ");
        query.setParameter("id", productTypeId);

        return (Long) query.uniqueResult();

    }

    public List<EnumMeasurementUnit> findAllUnits() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select distinct( unit) from Product p ");//for fetching different units

        return query.list();
    }

    public Double findAvgStockAmount() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select avg( stockAmount) from Product p ");

        return (Double) query.uniqueResult();
    }

    public List<ProductDTO> findAllProductDTO() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select new com.company.main.dto.ProductDTO( p.id,p.name,p.value) from Product p ");

        return query.list();

    }

    public List<ProductInformDTO> findAllInformDTO() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select new com.company.main.dto.ProductInformDTO( p.id,p.name,p.value,pk.name,pk.enumProductKind) from Product p"
                + ",ProductKind pk where p.productKind.id = pk.id");

        return query.list();
    }

    public BigDecimal findMaxValue() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select max( p.value) from Product p ");

        return (BigDecimal) query.uniqueResult();
    }

    public BigDecimal findMinValue() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select min( p.value) from Product p ");

        return (BigDecimal) query.uniqueResult();
    }

    public List<Product> callproduct_findAllProcedure() {// for calling without parameter procedure from database with createNativeQuery()
        Session session = sessionFactory.openSession();
        NativeQuery<Product> nativeQuery = session.createNativeQuery("{call product_findAll()}", Product.class);

        return nativeQuery.list();
    }

    public List<Product> callFindProductBetween(BigDecimal min, BigDecimal max) {// for calling with parameter procedure from database with createNativeQuery()
        Session session = sessionFactory.openSession();
        NativeQuery<Product> nativeQuery = session.createNativeQuery("{call find_product_between(:minimum,:maximum)}", Product.class);
        nativeQuery.setParameter("minimum", min);
        nativeQuery.setParameter("maximum", max);

        return nativeQuery.list();
    }

    public List<Product> callproduct_findAllProcedure2() {// for calling without parameter procedure from database with createStoredProcedureQuery()
        Session session = sessionFactory.openSession();
        StoredProcedureQuery createStoredProcedureQuery = session.createStoredProcedureQuery("product_findAll", Product.class);

        return createStoredProcedureQuery.getResultList();
    }

    public List<Product> callFindProductBetween2(BigDecimal min, BigDecimal max) {// for calling with parameter procedure from database with createStoredProcedureQuery()
        Session session = sessionFactory.openSession();
        StoredProcedureQuery createStoredProcedureQuery = session.createStoredProcedureQuery("find_product_between", Product.class);
        
        createStoredProcedureQuery.registerStoredProcedureParameter("minimum", BigDecimal.class, ParameterMode.IN);
        createStoredProcedureQuery.registerStoredProcedureParameter("maximum", BigDecimal.class, ParameterMode.IN);
        
        
        createStoredProcedureQuery.setParameter("minimum", min);
        createStoredProcedureQuery.setParameter("maximum", max);

        return createStoredProcedureQuery.getResultList();
    }

}
