package com.fatma.springdatamongoDB.repositry;

import com.fatma.springdatamongoDB.docment.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
