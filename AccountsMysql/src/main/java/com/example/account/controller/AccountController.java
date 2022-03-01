package com.example.account.controller;

import com.example.account.Model.Account;
import com.example.account.Service.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImp accountService;

    @GetMapping("/accounts")
    public List<Account> getAccount(){
       return accountService.getAllAcconut();

    }

    @PostMapping("/create")
    public  Account createAccount(@RequestBody Account account){
        Account account1=  accountService.createAccount();
        return  account1;
    }

    //@GetMapping("/id")
    //public ResponseEntity<Account> getById(@PathVariable("id") Integer id){
      //  Account one= accountService.findById(id);
        //log.info("account by Id: {}", id);
        //return  new ResponseEntity<Account>(one,HttpStatus.OK);


}
