/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.services;

import com.company.main.dao.ProductKindDAO;
import com.company.main.entities.Product;
import com.company.main.entities.ProductKind;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.query.Query;

/**
 *
 * @author murad_isgandar
 */
public class ProductKindService {
    
    private ProductKindDAO productKindDAO;

    public ProductKindService() {
        
        productKindDAO = new ProductKindDAO();
    }
    
    public List<ProductKind> findAll(){
        return productKindDAO.findAll();
    }
    
    public ProductKind findById(Long id){
        return productKindDAO.findById(id);
    }
    
    //MatchMode interface is used for like operation
    public List<ProductKind> findByName(String name, MatchMode matchMode) {

        return productKindDAO.findByName(name, matchMode);

    }
}
