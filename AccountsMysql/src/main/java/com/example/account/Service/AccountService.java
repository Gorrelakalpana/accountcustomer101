package com.example.account.Service;

import com.example.account.Model.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAllAcconut();

    public Account addaccount(Account account);
    public Account findById(Integer id);
}
