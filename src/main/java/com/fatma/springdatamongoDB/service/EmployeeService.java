package com.fatma.springdatamongoDB.service;

import com.fatma.springdatamongoDB.docment.Employee;
import com.fatma.springdatamongoDB.repositry.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public ResponseEntity<?> addEmp(Employee employee){
        return new ResponseEntity<>(employeeRepo.insert(employee), HttpStatus.CREATED);
    }
    public ResponseEntity<?> updateEmp(Employee employee){
        checkEmpIfExistOrThrowException(employee.getId());
        return new ResponseEntity<>(employeeRepo.save(employee), HttpStatus.CREATED);
    }

    public ResponseEntity<?> findEmpById(String id){
        Optional<Employee> employee=employeeRepo.findById(id);
        if(employee.isPresent()){
            return new ResponseEntity<>(employee, HttpStatus.FOUND);
        }
        else {
            return new ResponseEntity<>("employee with"+ id + "not found",HttpStatus.NOT_FOUND );
        }
    }
    public ResponseEntity<?> findAllEmp(){
        List<Employee> employees=employeeRepo.findAll();
        if(!employees.isEmpty() && employees !=null){
            return new ResponseEntity<>(employees, HttpStatus.FOUND);

        }
        else {
            return new ResponseEntity<>(" NO employees found",HttpStatus.NOT_FOUND );
        }
    }

    public ResponseEntity<?> deleteEmpById(String id){
        checkEmpIfExistOrThrowException(id);
        employeeRepo.deleteById(id);
        return new ResponseEntity<>("employee with " + id +"deleted ",HttpStatus.OK);
    }
    public void checkEmpIfExistOrThrowException(String id){
        findEmpById(id);
    }

    }
