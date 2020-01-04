/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service.impl.test;

import com.example.restfulAPI.dto.UserDTO;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 *
 * @author murad_isgandar
 */
public class TestUserDTO {

    @Spy
    private UserDTO userDTO;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test() {
        when(userDTO.getSurname()).thenReturn("Rasullu");
        System.out.println(userDTO.getName());
        System.out.println(userDTO.getSurname());
    }

}
