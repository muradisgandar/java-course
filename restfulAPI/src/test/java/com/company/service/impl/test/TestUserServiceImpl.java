/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.impl.test;

import com.example.restfulAPI.dao.UserRepository;
import com.example.restfulAPI.entities.User;
import com.example.restfulAPI.services.UserServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
/**
 *
 * @author murad_isgandar
 */
public class TestUserServiceImpl {
    
    private UserServiceImpl userServiceImpl;
    
    @Mock
    private UserRepository userRepo;
    
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        userServiceImpl = new UserServiceImpl(userRepo);
    }
    
    @Test
    public void testGetAll(){
        List<User> dummyList = new ArrayList<>();
        when(userRepo.findAll()).thenReturn(dummyList);
        
        userServiceImpl.getAll();
        
        verify(userRepo, times(1)).findAll();
    }
     
    @Test
    public void testFindByIdOnSuccess(){
        Optional<User> optUser = Optional.of(new User(1));
        when(userRepo.findById(1)).thenReturn(optUser);
        
        User user = userServiceImpl.findUserById(1);
        
        Assert.assertEquals(optUser.get(), user);
        Assert.assertEquals(new Integer(1), user.getId());
        
        verify(userRepo, times(1)).findById(1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindByIdOnFailure(){
        
        User user = userServiceImpl.findUserById(null);
        
    }
    
    
    
}
