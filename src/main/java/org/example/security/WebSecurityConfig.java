package org.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors() // Enable CORS
                .and()
                .csrf().disable()
                .headers()
                .frameOptions().disable() // Disable X-Frame-Options header
                .and()
                .authorizeRequests()
                .antMatchers("/api/auth/info").permitAll()
                .antMatchers("/api/auth/send-token").permitAll()
                .antMatchers("/api/users/**").permitAll()
                .antMatchers("/api/reservations/**").permitAll()
                .antMatchers("/api/image/**").permitAll()
                .antMatchers("/api/problems/**").permitAll()
                .antMatchers("/api/pdfs/**").permitAll()
                .anyRequest().authenticated();
        return http.build();
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOriginPattern("http://localhost:4200"); // <--- allows flexible matching
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}