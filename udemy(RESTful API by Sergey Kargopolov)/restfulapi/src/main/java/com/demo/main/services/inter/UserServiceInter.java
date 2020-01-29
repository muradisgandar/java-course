/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.services.inter;

import com.demo.main.bean.User;
import com.demo.main.dto.UserDTO;

/**
 *
 * @author murad_isgandar
 */
public interface UserServiceInter {
    
    User getUser(String id);

    User createUser(UserDTO userdto);
    
    User updateUser(UserDTO userdto,String id);
    
    String removeUser(String id);
}
