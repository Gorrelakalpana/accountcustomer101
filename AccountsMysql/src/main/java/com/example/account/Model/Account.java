package com.example.account.Model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account1")
@Data
public class Account {
    @Id
    private long id;
    private String accountNumber;
    private double currentBalance;
    private String bankName;
    private String deposit;
    private int addmoneny;


    public Account(long id, String accountNumber, double currentBalance, String bankName, String deposit) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.deposit = deposit;
    }



    }
