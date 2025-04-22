package org.example.services;

import org.example.Entity.primary.MetabaseUserModel;
import org.example.Repository.primary.MetabaseUserModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetabaseUserModelService {

    @Autowired
    private MetabaseUserModelRepository metabaseUserModelRepository;

    public MetabaseUserModel getUserByNomEmp(String nomEmp) {
        return metabaseUserModelRepository.findByNomEmp(nomEmp);
    }
}