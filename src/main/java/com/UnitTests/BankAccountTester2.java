package com.UnitTests;

import com.Classes.*;

public class BankAccountTester2 {

    public static void main(String[] args) {
        var account1 = new BankAccount2("99786754", "Gayle Forcewind");
        var account2 = new BankAccount2("99887776", "Stan Dandy-Liver");

        account1.deposit(1000.0);
        account2.deposit(2000.0);

        BankAccount2.setInterestRate(10.0);

        account1.addInterest();
        account2.addInterest();

        System.out.println(String.format("Account Number: %s\nAccount Name: %s\nInterest Rate: %f\nCurrent Balance: %f",
                                         account1.getAccountNumber(),
                                         account1.getAccountName(),
                                         BankAccount2.getInterestRate(),
                                         account1.getBalance()));
        System.out.println(String.format("Account Number: %s\nAccount Name: %s\nInterest Rate: %f\nCurrent Balance: %f",
                                         account2.getAccountNumber(),
                                         account2.getAccountName(),
                                         BankAccount2.getInterestRate(),
                                         account2.getBalance()));
    }
}
