/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.main.services;

import com.example.main.entities.User;
import java.util.List;

/**
 *
 * @author murad_isgandar
 */
public interface UserServiceInter {
    
    public User findUserById(int id);

    public List<User> getAll();

    public List<User> getAllStudents(String name, String surname, Integer age);

    public int addStudent(User u) ;

    public boolean updateStudent(User u) ;

    public int deleteStudent(int id) ;

}
