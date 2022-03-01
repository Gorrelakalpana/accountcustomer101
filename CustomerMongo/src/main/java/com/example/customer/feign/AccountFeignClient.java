package com.example.customer.feign;

import com.example.customer.Model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name = "AccountMysql", configuration = CustomerRetryClientConfig.class,fallbackFactory = HystrixFallBackFactory.class)
@FeignClient(name = "AccountMysql", fallbackFactory = HystrixFallBackFactory.class)
public interface AccountFeignClient {

    @GetMapping(value = "/customer/accounts")
    Account getId(@PathVariable Integer id);
    List<Account> getCustomers() ;
}