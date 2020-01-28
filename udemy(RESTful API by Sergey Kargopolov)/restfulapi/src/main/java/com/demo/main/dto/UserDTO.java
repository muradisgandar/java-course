/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author murad_isgandar
 */
@Data
public class UserDTO {
    
    @NotNull(message = "Name cannot be null")
    @Size(min = 3,max = 12,message = "Name must be equal or greater than 3 characters and less than 12 characters")
    private String name;
    
    @NotNull(message = "Surname cannot be null")
    @Size(min = 6,max = 16,message = "Surname must be equal or greater than 6 characters and less than 16 characters")
    private String surname;
    
    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
    
}
