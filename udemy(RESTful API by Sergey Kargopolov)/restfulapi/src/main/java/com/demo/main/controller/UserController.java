/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.controller;

import com.demo.main.bean.User;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author murad_isgandar
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping//@RequestParam(value = "page", defaultValue = "1") default shows that if no request param has sended ,then page is accepted 1
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "50") Integer limit,
            @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort) {

        return "getUsers " + "page " + page + " limit " + limit + " sort " + sort;
    }

    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_XML_VALUE,
        MediaType.APPLICATION_JSON_VALUE})
    public User getUser(@PathVariable Integer id) {
        User returnObj = new User();
        returnObj.setName("Murad");
        returnObj.setSurname("Isgandarli");
        returnObj.setEmail("mr.murad157@mail.ru");
        return returnObj;
    }

    @PostMapping
    public String addUser() {
        return "adduser";
    }

    @PutMapping
    public String updateUser() {
        return "updateuser";
    }

    @DeleteMapping
    public String deleteUser() {
        return "deleteuser";
    }

}
