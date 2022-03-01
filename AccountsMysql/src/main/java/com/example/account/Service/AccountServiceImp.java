package com.example.account.Service;

import com.example.account.Model.Account;
import com.example.account.Repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements AccountService {
    @Autowired
    AccountRepo accountRepo;

    @Override
    public List<Account> getAllAcconut() {
        return accountRepo.findAll();
    }

    @Override
    public Account addaccount(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public Account findById(Integer id) {
        return accountRepo.findById(id);
    }

    public Account createAccount() {
        return null;
    }
}
