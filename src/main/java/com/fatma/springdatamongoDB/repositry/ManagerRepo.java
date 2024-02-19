package com.fatma.springdatamongoDB.repositry;

import com.fatma.springdatamongoDB.docment.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepo extends MongoRepository<Manager,String> {
    @Query(value = "{'email' : ?0, 'password' : ?1 }")
    Manager findByEmailAndPassword(String email,String password);
}
