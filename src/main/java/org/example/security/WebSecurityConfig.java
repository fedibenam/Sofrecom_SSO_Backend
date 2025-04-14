package org.example.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/auth/info").permitAll()
                .antMatchers("/api/auth/send-token").permitAll() // Allow access to /api/auth/** without authentication
                .antMatchers("/api/users/**").permitAll() // Allow access to /api/users/** without authentication
                .anyRequest().authenticated();
    }
}