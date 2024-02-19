package com.fatma.springdatamongoDB.docment;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Employee {
    @Id
    private String id;

    @NotNull(message = "please,enter your first Name")
    private String firstName;
    @NotNull(message = "please,enter your last Name")
    private String lastName;
    private int age;
    private double salary;

}
