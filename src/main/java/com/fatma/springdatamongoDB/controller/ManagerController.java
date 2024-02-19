package com.fatma.springdatamongoDB.controller;

import com.fatma.springdatamongoDB.docment.Manager;
import com.fatma.springdatamongoDB.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company/")
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @PostMapping("addManager")
    public ResponseEntity<?> addManager(@RequestBody Manager manager){
        return managerService.addManager(manager);
    }
    @PostMapping("login")
    public Manager login(String email,String password){
     return managerService.login(email,password);
    }
}
