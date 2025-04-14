package org.example.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.stream.Collectors;

@Component
public class JwtTokenProvider {

    @Value("${bezkoder.app.jwtSecret}")
    private String jwtSecret;

    @Value("${bezkoder.app.jwtExpirationMs}")
    private int jwtExpirationMs;

    public String createToken(UserDetails userDetails) {
        UserDetailsImpl userDetailsImpl = (UserDetailsImpl) userDetails;
        return Jwts.builder()
                .setSubject(userDetailsImpl.getUsername())
                .claim("name", userDetailsImpl.getFullName())
                .claim("groups", userDetailsImpl.getAuthorities().stream()
                        .map(authority -> authority.getAuthority())
                        .collect(Collectors.toList())) // Store roles as JSON array
                .claim("roles", userDetailsImpl.getRoleNames()) // Add roleNames as a claim
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }
}