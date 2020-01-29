/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.exceptions;

import com.demo.main.dto.ErrorDTO;
import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author murad_isgandar
 */
@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {
        
        String errorDetails = ex.getLocalizedMessage();
        
        if(errorDetails==null){
            errorDetails = ex.toString();
        }
        
        ErrorDTO errorDTO = new ErrorDTO(new Date(), errorDetails);
        
        return new ResponseEntity<>(
                errorDTO, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

    }
    
    @ExceptionHandler(value = {UserServiceException.class,NullPointerException.class})
    public ResponseEntity<Object> handleSpecificException(Exception ex, WebRequest request) {
        
        String errorDetails = ex.getLocalizedMessage();
        
        if(errorDetails==null){
            errorDetails = ex.toString();
        }
        
        ErrorDTO errorDTO = new ErrorDTO(new Date(), errorDetails);
        
        return new ResponseEntity<>(
                errorDTO, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

    }
    

}
