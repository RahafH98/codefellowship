package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserSiteRepositry UserSiteRepositry;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserSite usersite= UserSiteRepositry.findByUserName(username);

        if (usersite == null) {
            System.out.println("User not found " + username);
            throw new UsernameNotFoundException("user" + username + " was not found in the db");
        }
        System.out.println("Found User: " + usersite.getUserName());

        return (UserDetails) usersite;



    }
}
