/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ws.services;

import com.demo.ws.User;
import com.demo.ws.*;

/**
 *
 * @author murad_isgandar
 */
public class EducationServiceClient {

    public static User getUser(String name) {

        EducationService_Service service = new EducationService_Service();
        EducationService port = service.getEducationServicePort();
        // TODO initialize WS operation arguments here
        // TODO process result here
        User result = port.getUserByName(name);

        return result;
    }

}
