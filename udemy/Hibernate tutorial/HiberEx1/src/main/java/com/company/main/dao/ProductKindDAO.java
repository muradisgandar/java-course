/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.dao;

import com.company.main.dto.ProductKindDTO;
import com.company.main.entities.Product;
import com.company.main.entities.ProductKind;
import com.company.main.utils.HibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
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

    public ProductKindDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<ProductKind> findAll() {

        Session session = sessionFactory.openSession();

        Query createQuery = session.createQuery("select p from ProductKind p");

        return createQuery.list();
    }

    public ProductKind findById(Long id) {

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

    public List<ProductKind> findByNameWithCriteria(String name, MatchMode matchMode) {

        String parameter = "";
        switch (matchMode) {
            case EXACT:
                parameter = name;
                break;

            case START:
                parameter = name + "%";
                break;

            case END:
                parameter = "%" + name;
                break;

            case ANYWHERE:
                parameter = "%" + name + "%";
                break;
        }

        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<ProductKind> query = criteriaBuilder.createQuery(ProductKind.class);

        Root<ProductKind> root = query.from(ProductKind.class);

        query.select(root).where(criteriaBuilder.like(root.get("name"), parameter));

        return session.createQuery(query).list();
    }

    public List<ProductKindDTO> findAllProductKindDTOGroupBy() {
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select new com.company.main.dto.ProductKindDTO(pk.id,pk.name,min(p.value)"
                + ",max(p.value)"
                + ",avg(p.value)"
                + ",sum(p.stockAmount)"
                + ",count(p.id)) "
                + "from Product p,ProductKind pk "
                + "where p.productKind.id = pk.id"
                + " group by pk.id , pk.name");

        return query.list();
    }
    
    public List<ProductKindDTO> findAllProductKindDTOGroupByWithCriteria() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        
        CriteriaQuery<ProductKindDTO> query = criteriaBuilder.createQuery(ProductKindDTO.class);
        
        Root<Product> root = query.from(Product.class);
        
        root.join("productKind", JoinType.INNER);
        
        query.groupBy(root.get("productKind").get("id"));
        
        query.select(criteriaBuilder.construct(ProductKindDTO.class, 
                root.get("productKind").get("id"),
                root.get("productKind").get("name"),
                criteriaBuilder.min(root.get("value")),
                criteriaBuilder.max(root.get("value")),
                criteriaBuilder.avg(root.get("value")),
                criteriaBuilder.sum(root.get("stockAmount")),
                criteriaBuilder.count(root.get("id"))
                
                ));
        
        return session.createQuery(query).list();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
