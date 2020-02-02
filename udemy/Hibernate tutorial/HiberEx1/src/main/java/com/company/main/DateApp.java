/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.main.entities.Product;
import com.company.main.services.ProductService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public class DateApp {

    public static void main(String[] args) {

        ProductService productService = new ProductService();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = null;
        try {
            date = sdf.parse("2020-12-31");
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

//        List<Product> prod = productService.findAllByRecentUsageDate(date);
        List<Product> prod2 = productService.findAllByRecentUsageDateWithCriteria(date);
//        prod.forEach(p -> System.out.println(p.getName() + "  " + p.getRecentUsageDate()));
        prod2.forEach(p -> System.out.println(p.getName() + "  " + p.getRecentUsageDate()));
    }
}
