/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.main.services;

import com.example.main.dao.UserRepository;
import com.example.main.entities.Authorities;
import com.example.main.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.Set;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userDetailsDao;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDetailsDao.findUserByUsername(username);
        UserBuilder builder = null;
        if (user != null) {

            builder = org.springframework.security.core.userdetails.User.withUsername(username);

            builder.disabled(!user.isEnabled());
            builder.password(user.getPassword());
            
            String[] arr = getAuthorityArr(user.getAuthorities());
            builder.authorities(arr);
        } else {
            throw new UsernameNotFoundException("User not found.");
        }
        return builder.build();
    }

    public static String[] getAuthorityArr(Set<Authorities> authorities) {

        String[] authoritiesArr = new String[authorities.size()];
        Iterator<Authorities> iter = authorities.iterator();
        int i = 0;
        while (iter.hasNext()) {
            Authorities a = iter.next();
            authoritiesArr[i] = a.getAuthority();
            i++;
        }

        return authoritiesArr;
    }
}
