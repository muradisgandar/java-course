/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulAPI.services;

import com.example.restfulAPI.dao.UserRepository;
import com.example.restfulAPI.entities.User;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

/**
 *
 * @author murad_isgandar
 */
@Service
@Transactional
public class UserServiceImpl implements UserServiceInter {

    @Autowired
    private UserRepository userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserRepository userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("id is null");
        }
        Optional<User> op = userDao.findById(id);
        return op.get();
    }

    @Override
    public List<User> getAll() {
//        Iterable<User> it = userDao.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        List<User> list = IteratorUtils.toList(it.iterator());
        List<User> list = userDao.findAll();
        return list;
    }

    @Override
    public List<User> getAllStudents(String name, String surname, Integer age) {
        Iterable<User> it = userDao.getAllStudents(name, surname, age);
        List<User> list = IteratorUtils.toList(it.iterator());
        return list;
    }

    @Override
    public int addStudent(User u) {
        userDao.save(u);
        return u.getId();
    }

    @Override
    public boolean updateStudent(User u) {
        userDao.save(u);
        return true;
    }

    @Override
    public int deleteStudent(int id) {
        userDao.deleteById(id);
        return id;
    }

    @Override
    public List<User> findUserByNameAndSurname(String name, String surname) {
        return userDao.findUserByNameAndSurname(name, surname);
    }

}
