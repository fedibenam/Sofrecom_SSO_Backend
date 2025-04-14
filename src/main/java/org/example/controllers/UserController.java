package org.example.controllers;

import org.example.models.UserInfo;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

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

    @PostMapping("/send-token")
    public ResponseEntity<Map<String, String>> sendTokenToDjango(@RequestBody UserInfo userInfo) {
        // Validate and process user information
        boolean isValid = userService.validateAndProcessUserInfo(userInfo);
        if (isValid) {
            // Generate JWT token
            String jwtToken = userService.generateJwtToken(userInfo);
            logger.info("Generated JWT token: {}", jwtToken);

            // Prepare request to Django application
            String djangoUrl = "http://127.0.0.1:8000/api/auth/validate-token"; // Replace with actual Django endpoint
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + jwtToken);
            HttpEntity<String> request = new HttpEntity<>(null, headers);

            // Send token to Django and get response
            ResponseEntity<String> djangoResponse = null;
            try {
                djangoResponse = restTemplate.exchange(djangoUrl, HttpMethod.POST, request, String.class);
                logger.info("Response from Django: {}", djangoResponse.getBody());
            } catch (HttpClientErrorException | HttpServerErrorException e) {
                logger.error("Error from Django: {}", e.getMessage());
                Map<String, String> errorResponse = new HashMap<>();
                errorResponse.put("message", "Error while communicating with Django: " + e.getMessage());
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
            } catch (Exception e) {
                logger.error("Unexpected error: {}", e.getMessage());
                Map<String, String> errorResponse = new HashMap<>();
                errorResponse.put("message", "Failed to communicate with Django application: " + e.getMessage());
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
            }

            // Return response to frontend
            Map<String, String> response = new HashMap<>();
            response.put("message", "Token sent successfully");
            response.put("djangoResponse", djangoResponse != null ? djangoResponse.getBody() : "No response from Django");
            return ResponseEntity.ok(response);
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Invalid user information");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
}