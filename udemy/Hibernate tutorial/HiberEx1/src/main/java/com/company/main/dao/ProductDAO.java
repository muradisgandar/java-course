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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TemporalType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
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
                criteriaBuilder.equal(root.get("id"), id)
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

        //for this method this code: criteriaBuilder.between(root.get("stockAmount"), min, max) dosen't work for me
        //but in video it works ,i don't know why it dosen't work in here(I assume that maybe hibernate version or other thing)
//        Root<Product> root = query.from(Product.class);
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

    public List<Product> findAllWithOrderWithCriteria() {
        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);

        Root<Product> root = query.from(Product.class);
        query.select(root);

        //for one parameter
//        query.orderBy(criteriaBuilder.asc(root.get("stockAmount")));
        //for many parameters
//        Order stockAmount = criteriaBuilder.asc(root.get("stockAmount"));
//        Order name = criteriaBuilder.asc(root.get("name"));
//        query.orderBy(stockAmount,name);
        //second way of set many parameters
        List<Order> list = new ArrayList<>();
        list.add(criteriaBuilder.asc(root.get("stockAmount")));
        list.add(criteriaBuilder.asc(root.get("stockAmount")));
        query.orderBy(list);

        return session.createQuery(query).list();

    }

    public List<Product> findAllWithOrderByLimit(int maxResult) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p order by stockAmount desc , name asc");
        query.setMaxResults(maxResult);//for limitiation for examp: if maxResult = 3 then only 3 data will be fetched

        return query.list();
    }

    public List<Product> findAllWithOrderByLimitWithCriteria(int maxResult) {

        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);
        Root<Product> root = query.from(Product.class);
        query.select(root).orderBy(criteriaBuilder.asc(root.get("id")));

        return session.createQuery(query).setMaxResults(maxResult).list();
    }

    public List<Product> findAllByRecentUsageDate(Date date) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select p from Product p where recentUsageDate >= :recentUsageDate");
        query.setParameter("recentUsageDate", date);

        return query.list();
    }

    public List<Product> findAllByRecentUsageDateWithCriteria(Date date) {
        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);
        Root<Product> root = query.from(Product.class);

        ParameterExpression<Date> parameter = criteriaBuilder.parameter(Date.class);
        Predicate recentUsageDate = criteriaBuilder.greaterThanOrEqualTo(root.get("recentUsageDate").as(Date.class), parameter);

        query.where(recentUsageDate);

        return session.createQuery(query).setParameter(parameter, date, TemporalType.DATE).list();

    }

    public Long sumStockAmountbyProductTypeId(Long productTypeId) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select sum( stockAmount) from Product p where productKind.id = :id ");
        query.setParameter("id", productTypeId);

        return (Long) query.uniqueResult();

    }
    
    public Long sumStockAmountbyProductTypeIdWithCriteria() {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        
        Root<Product> root = query.from(Product.class);
        
        query.select(criteriaBuilder.sumAsLong(root.get("stockAmount")));
        
        return session.createQuery(query).uniqueResult();
        
    }

    public Long countProductbyProductTypeId(Long productTypeId) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select count( p) from Product p where productKind.id = :id ");
        query.setParameter("id", productTypeId);

        return (Long) query.uniqueResult();

    }
    
    public Long countProductbyProductTypeIdWithCriteria(Long productTypeId) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        
        Root<Product> root = query.from(Product.class);
        
        query.select(criteriaBuilder.count(root.get("id")));
        
        query.where(criteriaBuilder.equal(
                root.get("productKind").get("id"), productTypeId));
        
        return session.createQuery(query).uniqueResult();
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
    
    public Double findAvgStockAmountWithCriteria() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        
        CriteriaQuery<Double> query = criteriaBuilder.createQuery(Double.class);
        Root<Product> root = query.from(Product.class);
        
        query.select(criteriaBuilder.avg(root.get("stockAmount")));
        
        return session.createQuery(query).uniqueResult();
    }

    public List<ProductDTO> findAllProductDTO() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select new com.company.main.dto.ProductDTO( p.id,p.name,p.value) from Product p ");

        return query.list();

    }
    
    public List<ProductDTO> findAllProductDTOWithCriteria() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        
        CriteriaQuery<ProductDTO> query = criteriaBuilder.createQuery(ProductDTO.class);
        Root<Product> root = query.from(Product.class);
        
        query.select(criteriaBuilder.construct(ProductDTO.class, 
                root.get("id"),
                root.get("name"),
                root.get("value")
                ));
        
        return session.createQuery(query).list();
    }

    public List<ProductInformDTO> findAllInformDTOByJoin() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select new com.company.main.dto.ProductInformDTO( p.id,p.name,p.value,pk.name,pk.enumProductKind) from Product p"
                + ",ProductKind pk where p.productKind.id = pk.id");

        return query.list();
    }
    
    public List<ProductInformDTO> findAllInformDTOByJoinWithCriteria() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        
        CriteriaQuery<ProductInformDTO> query = criteriaBuilder.createQuery(ProductInformDTO.class);
        Root<Product> root = query.from(Product.class);
        
        root.join("productKind", JoinType.INNER);
        
        query.select(criteriaBuilder.construct(ProductInformDTO.class,
                root.get("id"),
                root.get("name"),
                root.get("value"),
                root.get("productKind").get("name"),
                root.get("productKind").get("enumProductKind")
                ));
        
        return session.createQuery(query).list();
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

    public BigDecimal findMaxValueWithCriteria() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        
        CriteriaQuery<BigDecimal> query = criteriaBuilder.createQuery(BigDecimal.class);
        Root<Product> root = query.from(Product.class);
        
        query.select(criteriaBuilder.max(root.get("value")));
        
        return session.createQuery(query).uniqueResult();
        
    }
    
    public BigDecimal findMinValueWithCriteria() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        
        CriteriaQuery<BigDecimal> query = criteriaBuilder.createQuery(BigDecimal.class);
        Root<Product> root = query.from(Product.class);
        
        query.select(criteriaBuilder.min(root.get("value")));
        
        return session.createQuery(query).uniqueResult();
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
