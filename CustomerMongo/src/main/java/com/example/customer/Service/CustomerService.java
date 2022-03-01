package com.example.customer.Service;

import com.example.customer.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CustomerService {

    public List<Customer> getCustomer();

    public Customer addCustomer(Customer customer);
    Optional<Customer> findById(Integer id);
}
