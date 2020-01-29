/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.dto;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author murad_isgandar
 */
@Data
public class ErrorDTO {
    
    private Date timeStamp;
    private String errorMessage;

    public ErrorDTO() {
    }

    public ErrorDTO(Date timeStamp, String errorMessage) {
        this.timeStamp = timeStamp;
        this.errorMessage = errorMessage;
    }
    
    
}
