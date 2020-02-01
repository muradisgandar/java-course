/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main.services;

import com.company.main.dao.ProductDAO;
import com.company.main.dto.ProductDTO;
import com.company.main.dto.ProductInformDTO;
import com.company.main.entities.Product;
import com.company.main.enums.EnumMeasurementUnit;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class ProductService {

    private ProductDAO productDAO;

    public ProductService() {

        productDAO = new ProductDAO();
    }

    public List<Product> findAll() {
        return productDAO.findAll();
    }

    public Product findById(Long id) {
        return productDAO.findById(id);
    }

    public List<Product> findAllProductBetweenStockAmountMaxAndMin(Long min, Long max) {
        return productDAO.findAllProductBetweenStockAmountMaxAndMin(min, max);
    }

    public List<Product> findAllProductBetweenStockAmountMaxAndMin2(Long min, Long max) {
        return productDAO.findAllProductBetweenStockAmountMaxAndMin2(min, max);
    }

    public List<Product> findAllWithOrder() {
        return productDAO.findAllWithOrder();
    }

    public List<Product> findAllWithOrderByLimit(int maxResult) {
        return productDAO.findAllWithOrderByLimit(maxResult);
    }

    public List<Product> findAllByRecentUsageDate(Date date) {
        return productDAO.findAllByRecentUsageDate(date);
    }

    public Long sumStockAmountbyProductTypeId(Long productTypeId) {
        return productDAO.sumStockAmountbyProductTypeId(productTypeId);
    }

    public Long countProductbyProductTypeId(Long productTypeId) {
        return productDAO.countProductbyProductTypeId(productTypeId);
    }
    
    public List<EnumMeasurementUnit> findAllUnits(){
        return productDAO.findAllUnits();
    }
    
    public Double findAvgStockAmount(){
        return productDAO.findAvgStockAmount();
    }
    
    public List<ProductDTO> findAllProductDTO() {
        return productDAO.findAllProductDTO();
    }
    
    public List<ProductInformDTO> findAllInformDTO() {
        return productDAO.findAllInformDTO();
    }
    
    public BigDecimal findMaxValue(){
        return productDAO.findMaxValue();
    }
    
    public BigDecimal findMinValue(){
        return productDAO.findMinValue();
    }
    
    public List<Product> callproduct_findAllProcedure() {
        return productDAO.callproduct_findAllProcedure();
    }
    
    public List<Product> callFindProductBetween(BigDecimal min, BigDecimal max) {
        return productDAO.callFindProductBetween(min, max);
    }
    
    public List<Product> callproduct_findAllProcedure2() {
        return productDAO.callproduct_findAllProcedure();
    }
    
    public List<Product> callFindProductBetween2(BigDecimal min, BigDecimal max) {
        return productDAO.callFindProductBetween(min, max);
    }
    
    /*
    --------------------------------------Criteria------------------------------------------------------
    */
    
    public List<Product> findAllWithCriteria() {
        return productDAO.findAllWithCriteria();
    }
    
    public Product findByIdWithCriteria(Long id) {
        return productDAO.findByIdWithCriteria(id);
    }
    
    public List<Product> findAllProductBetweenStockAmountMaxAndMinWithCriteria(Long min, Long max) {
        return productDAO.findAllProductBetweenStockAmountMaxAndMinWithCriteria(min, max);
    }
    
    public List<Product> findAllWithOrderWithCriteria() {
        return productDAO.findAllWithOrderWithCriteria();
    }
}
