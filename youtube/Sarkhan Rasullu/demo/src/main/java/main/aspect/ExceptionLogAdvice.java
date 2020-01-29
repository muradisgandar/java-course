/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.aspect;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author murad_isgandar
 */
@ControllerAdvice
public class ExceptionLogAdvice {

    private static final Logger LOG = Logger.getLogger(ExceptionLogAdvice.class.getName());
    
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handleValidationException(final Exception exception){
        LOG.log(Level.SEVERE,null,exception);
        
        
        
        return "error";
    }
}
