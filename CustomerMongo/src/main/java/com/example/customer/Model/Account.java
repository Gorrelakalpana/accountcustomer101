package com.example.customer.Model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Account {
    private long id;
    private String accountNumber;
    private double currentBalance;
    private String bankName;
    private String deposit;

    @Enumerated(EnumType.STRING)
    private  AccountType type;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
}
