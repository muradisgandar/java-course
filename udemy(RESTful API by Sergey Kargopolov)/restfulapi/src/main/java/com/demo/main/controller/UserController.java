/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.controller;

import com.demo.main.bean.User;
import com.demo.main.dto.ResponseDTO;
import com.demo.main.dto.UserDTO;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity getUser(@PathVariable Integer id) {
        User returnObj = new User();
        returnObj.setName("Murad");
        returnObj.setSurname("Isgandarli");
        returnObj.setEmail("mr.murad157@mail.ru");
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO(returnObj, "Successfully got", 200));
    }

    //consumes - produces (xml va ya json ile alib,xml ve ya json ile qaytarmaq(return etmek))
    //@RequestBody bu annotation bir nov MVC deki @ModelAttribute u evez edir
    @PostMapping(
            consumes = {MediaType.APPLICATION_XML_VALUE,
                MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,
                MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addUser(@Valid @RequestBody UserDTO user) {

        User returnObj = new User();
        returnObj.setName(user.getName());
        returnObj.setSurname(user.getSurname());
        returnObj.setEmail(user.getEmail());

        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO(returnObj, "Successfully added", 200));
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
