package com.example.customer.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Document(collection = "customer")
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Customer {

    @Id
    private int id;

    @NotBlank(message = "Name cannot be blank")
    private String customerName;
    @NotNull(message = "Name may not be null")
    @Size(min=3, max= 20, message = "Lastname should be between 3 and 20")
    private String firstName;
    private String lastName;

    public Customer(int id, String customerName, String firstName, String lastName, Date createdDate, Boolean isActive, Address address) {
        this.id = id;
        this.customerName = customerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = createdDate;
        this.isActive = isActive;
        this.address = address;
    }

    private Date createdDate;
    private Boolean isActive;
    private Address address;
}
