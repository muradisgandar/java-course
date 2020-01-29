/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.utilities;

import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 *
 * @author murad_isgandar
 */
@Service
public class RandomIdUtil {
    
    public String generateUserId(){
        return UUID.randomUUID().toString();
    }
}
