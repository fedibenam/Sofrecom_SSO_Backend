package org.example.controllers;

import org.example.models.UserInfo;
import org.example.security.JwtTokenProvider;
import org.example.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class TokenSenderController {

    private static final Logger logger = LoggerFactory.getLogger(TokenSenderController.class);

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserService userService;



}
