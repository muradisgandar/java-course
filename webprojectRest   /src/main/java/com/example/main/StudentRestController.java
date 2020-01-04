/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.main;

import com.example.main.dto.ResponseDTO;
import com.example.main.dto.UserDTO;
import com.example.main.entities.User;
import com.example.main.services.UserServiceInter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author murad_isgandar
 */
@RestController
public class StudentRestController {

    @Autowired
    UserServiceInter userservice;

    @RequestMapping("/student")
    public ResponseEntity page(@RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "surname", required = false) String surname) {

        List<UserDTO> result = new ArrayList<UserDTO>();
        List<User> users = null;
        if (name != null && surname != null) {
            users = userservice.findUserByNameAndSurname(name, surname);
        } else {
            users = userservice.getAll();
        }

        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            result.add(new UserDTO(u.getId(), u.getName(), u.getSurname(), u.getUsername(), u.getAge(), u.isEnabled()));

        }

        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO(result));

    }

    @RequestMapping("/student/{id}")
    public ResponseEntity page(@PathVariable("id") int id) {
        User u = userservice.findUserById(id);

        UserDTO result = (new UserDTO(u.getId(), u.getName(), u.getSurname(), u.getUsername(), u.getAge(), u.isEnabled()));

        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO(result));

    }

    @PostMapping("/student")
    public ResponseEntity addUser(@RequestBody UserDTO userdto) {

        int id = userservice.addStudent(new User(null, userdto.getName(), userdto.getSurname(), userdto.getUsername(), null, true, 0));
        userdto.setId(id);

        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO(userdto));

    }

}
