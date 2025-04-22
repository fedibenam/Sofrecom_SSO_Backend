package org.example.services;

import org.example.Entity.primary.User;
import org.example.Repository.primary.UserRepository;
import org.example.models.UserInfo;
import org.example.Repository.primary.UserRoleCombinedRepository;
import org.example.security.JwtTokenProvider;
import org.example.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserRoleCombinedRepository userRoleCombinedRepository;

    public boolean validateAndProcessUserInfo(UserInfo userInfo) {
        UserDetails userDetails;

        // Check if the user already exists using Optional
        User existingUser = userRepository.findByUsername(userInfo.getUsername())
                .orElse(null); // Get the user or null if not found

        if (existingUser == null) {
            // If the user doesn't exist, create and save a new user
            userRepository.save(new User(userInfo.getUsername(), userInfo.getFullName(), userInfo.getGroups()));
        } else {
            // If the user exists, ensure they have the proper role
            if (!userInfo.getGroups().contains("Utilisa. du domaine")) {
                userInfo.getGroups().add("Utilisa. du domaine");
            }
        }

        // Load the user details after ensuring user exists or is created
        userDetails = loadUserByUsername(userInfo.getUsername());

        return true; // Return true if validation is successful
    }

    public String generateJwtToken(UserInfo userInfo) {
        String role = userRoleCombinedRepository.findRoleByNomEmp(userInfo.getFullName());
        String roleName = role != null ? role : "DEFAULT_ROLE"; // default if no role found
        UserDetailsImpl userDetails = new UserDetailsImpl(userInfo, Collections.singletonList(roleName));
        return jwtTokenProvider.createToken(userDetails);
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new UserDetailsImpl(user);
    }
}