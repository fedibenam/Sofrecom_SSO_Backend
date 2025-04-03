package org.example.services;

import org.example.Entity.User;
import org.example.Repository.UserRepository;
import org.example.models.UserInfo;
import org.example.security.JwtTokenProvider;
import org.example.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    public boolean validateAndProcessUserInfo(UserInfo userInfo) {
        UserDetails userDetails;
        try {
            userDetails = loadUserByUsername(userInfo.getUsername());
        } catch (UsernameNotFoundException e) {
            userRepository.save(new User(userInfo.getUsername(), userInfo.getFullName(), userInfo.getGroups()));
            userDetails = loadUserByUsername(userInfo.getUsername());
        }

        // Ensure the collaborateur role is included
        if (!userInfo.getGroups().contains("Utilisa. du domaine")) {
            userInfo.getGroups().add("Utilisa. du domaine");
        }

        return true; // Return true if validation is successful
    }

    public String generateJwtToken(UserInfo userInfo) {
        UserDetails userDetails = loadUserByUsername(userInfo.getUsername());
        return jwtTokenProvider.createToken(userDetails);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new UserDetailsImpl(user);
    }
}