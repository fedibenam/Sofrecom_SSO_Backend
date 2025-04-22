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

    public ResponseEntity<Map<String, String>> sendTokenToDjango(@RequestBody UserInfo userInfo) {
        // Validate and process user information
        boolean isValid = userService.validateAndProcessUserInfo(userInfo);
        if (isValid) {
            // Generate JWT token
            String jwtToken = userService.generateJwtToken(userInfo);
            logger.info("Generated JWT token: {}", jwtToken);

            // Prepare request to Django application
            String djangoUrl = "http://127.0.0.1:8000/sso-login/"; // Replace with actual Django endpoint
            RestTemplate restTemplate = new RestTemplate();
            Map<String, String> tokenBody = new HashMap<>();
            tokenBody.put("token", jwtToken);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<Map<String, String>> request = new HttpEntity<>(tokenBody, headers);
            ResponseEntity<String> djangoResponse = restTemplate.postForEntity(djangoUrl, request, String.class);


            // Send token to Django and get response
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

            // Check Django response to determine success
            if (djangoResponse != null && djangoResponse.getStatusCode() == HttpStatus.OK) {
                Map<String, String> response = new HashMap<>();
                response.put("message", "SSO token validated successfully");
                response.put("djangoResponse", djangoResponse.getBody());
                return ResponseEntity.ok(response);
            } else {
                Map<String, String> response = new HashMap<>();
                response.put("message", "Invalid token or failed authentication");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
            }
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Invalid user information");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
}
