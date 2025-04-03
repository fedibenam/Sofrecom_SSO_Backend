package org.example.controllers;

import org.example.models.UserInfo;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/auth")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/info")
    public ResponseEntity<Map<String, String>> receiveUserInfo(@RequestBody UserInfo userInfo) {
        boolean isValid = userService.validateAndProcessUserInfo(userInfo);
        if (isValid) {
            String jwtToken = userService.generateJwtToken(userInfo);
            logger.info("Generated JWT token: {}", jwtToken);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Token generated successfully");
            response.put("token", jwtToken);
            return ResponseEntity.ok(response);
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Unauthorized");
            return ResponseEntity.status(401).body(response);
        }
    }
}