package com.fatma.springdatamongoDB.docment;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "managers")
public class Manager {
    @Id
    private String id;

    @NotNull(message = "please,enter your first Name")
    private String firstName;
    @NotNull(message = "please,enter your last Name")
    private String lastName;

    @Email
    @NotNull(message = "please,enter your email")
    private String email;

    @NotNull(message = "please,enter your password")
    @NotEmpty
    @Size(min = 4,max = 18,message = "should enter your password between 4 and 18")
    private String password;
}
