package com.example.customer.Controller;

import com.example.customer.Model.Account;
import com.example.customer.Model.Customer;
import com.example.customer.Service.CustomerService;
import com.example.customer.feign.AccountFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;


    @RestController
    @RequestMapping("/customer")
    public class CustomerController {
        private static Logger log = LoggerFactory.getLogger(CustomerController.class);
        @Autowired
        private CustomerService customerService;
        @Autowired
        private RestTemplate restTemplate;
       // @Autowired
        //AccountFeignClient accountFeignClient;

        @GetMapping("/getcustomer")
        public List<Customer> getCustomers() {
            List<Customer> list = customerService.getCustomer();
            return  list;

        }

        @PostMapping("/Createcustomer")
        public Customer addCustomer(@Valid @RequestBody Customer customer) {
            return customerService.addCustomer(customer);

        }


        @PostMapping("/create/account")
        public Account addAccount(@RequestBody Account account){
            HttpEntity<Account> entity=new HttpEntity<>(account);
            return restTemplate.exchange("http://localhost:8069/acc/createaccount", HttpMethod.POST,entity,Account.class).getBody();

        }
        @GetMapping("/accounts")
        public String getAccounts(){
            return restTemplate.exchange("http://account1/acc/getaccount",
                    HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
        }

}
