/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.dto;

import lombok.Data;

/**
 *
 * @author murad_isgandar
 */
@Data
public class ResponseDTO {
    
    private Object obj;
    private String msg;
    private Integer code;

    public ResponseDTO(Object obj, String msg, Integer code) {
        this.obj = obj;
        this.msg = msg;
        this.code = code;
    }
    
    
}
