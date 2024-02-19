package com.fatma.springdatamongoDB.controller;

import com.fatma.springdatamongoDB.docment.Employee;
import com.fatma.springdatamongoDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("addEmp")
    public ResponseEntity<?> addEmp(@RequestBody Employee employee) {
        return employeeService.addEmp(employee);
    }
    @PutMapping("updateEmp")
    public ResponseEntity<?> updateEmp(@RequestBody Employee employee) {
        return employeeService.updateEmp(employee);
    }
    @GetMapping("getEmpById/{id}")
    public ResponseEntity<?> findEmpById(@PathVariable String id) {
        return employeeService.findEmpById(id);
    }
    @GetMapping("showAllEmployees")
    public ResponseEntity<?> findAllEmp(){
        return employeeService.findAllEmp();
    }
@DeleteMapping("deleteById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable  String id) {
        return employeeService.deleteEmpById(id);
    }

    }
