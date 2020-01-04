/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ws.services;

import com.demo.ws.User;

/**
 *
 * @author murad_isgandar
 */
public class Main {
    public static void main(String[] args) {
        
        User u = EducationServiceClient.getUser("Murad");
        System.out.println("result="+u.getName());
    }
    
}
