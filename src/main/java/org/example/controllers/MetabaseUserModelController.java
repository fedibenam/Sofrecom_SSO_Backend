package org.example.controllers;

import org.example.Entity.primary.MetabaseUserModel;
import org.example.services.MetabaseUserModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/users")
public class MetabaseUserModelController {

    @Autowired
    private MetabaseUserModelService metabaseUserModelService;

    @GetMapping("/{nomEmp}")
    public MetabaseUserModel getUserByNomEmp(@PathVariable String nomEmp) {
        return metabaseUserModelService.getUserByNomEmp(nomEmp);
    }
}