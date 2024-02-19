package com.fatma.springdatamongoDB.service;

import com.fatma.springdatamongoDB.docment.Manager;
import com.fatma.springdatamongoDB.repositry.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepo managerRepo;
    public ResponseEntity<?> addManager(Manager manager){
        return new ResponseEntity<>(managerRepo.insert(manager), HttpStatus.CREATED);
    }

    public Manager login(String email,String password){
        return managerRepo.findByEmailAndPassword(email,password);

    }
}
