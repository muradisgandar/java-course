/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.services.impl;

import com.demo.main.bean.User;
import com.demo.main.dto.ResponseDTO;
import com.demo.main.dto.UserDTO;
import com.demo.main.services.inter.UserServiceInter;
import com.demo.main.utilities.RandomIdUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author murad_isgandar
 */
@Service
public class UserServiceImpl implements UserServiceInter {

    Map<String, User> users;
    RandomIdUtil randomIdUtil;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(RandomIdUtil randomIdUtil) {
        this.randomIdUtil = randomIdUtil;
    }
    

    @Override
    public User createUser(UserDTO userdto) {
        User returnObj = new User();
        returnObj.setName(userdto.getName());
        returnObj.setSurname(userdto.getSurname());
        returnObj.setEmail(userdto.getEmail());

        String id = randomIdUtil.generateUserId();
        returnObj.setId(id);

        if (users == null) {
            users = new HashMap<>();
        }
        users.put(id, returnObj);

        return returnObj;
    }

    @Override
    public User updateUser(UserDTO userdto, String id) {

        User user = users.get(id);
        user.setName(userdto.getName());
        user.setSurname(userdto.getSurname());

        users.put(id, user);

        return user;
    }

    @Override
    public String removeUser(String id) {

        users.remove(id);
        
        return id;

    }

    @Override
    public User getUser(String id) {
        
        if (users.containsKey(id)) {
            return users.get(id);
        } else {
            return null;
        }
    }

}
