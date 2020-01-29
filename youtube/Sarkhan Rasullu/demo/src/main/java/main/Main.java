/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    public static void main(String[] args) {
        String s = new BCryptPasswordEncoder().encode("12345");
        System.out.println(s);
    }

}
