package com.example.customer.Service;

import com.example.customer.Model.Customer;
import com.example.customer.Repo.CustomerRepo;
import com.example.customer.Model.Customer;
import com.example.customer.Repo.CustomerRepo;
import com.example.customer.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
         Optional<Customer> customer=customerRepo.findById(id);
         if(!customer.isPresent())
             throw new CustomerNotFoundException("please customer id");
         return customer;

        }
    }


