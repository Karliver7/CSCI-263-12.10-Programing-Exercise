package com.Classes;

public class BankAccount {
    private String _accountNumber;
    private String _accountName;
    private double _balance;

    public BankAccount(String accountNumber, String accountName){
        _accountNumber = accountNumber;
        _accountName = accountName;
        _balance = 0.0;
    }

    public String getAccountNumber() {
        return _accountNumber;
    }

    public String getAccountName() {
        return _accountName;
    }

    public double getBalance(){
        return _balance;
    }
    public void deposit(double d){
        _balance += d;
    }
    public boolean withdraw(double w){
        if(w > _balance)
            return false;

        _balance -= w;
        return true;
    }

    @Override
    public String toString(){
        return String.format("Account Number: %s\nAccount Name: %s\nAccount Balance: %,.2f", _accountNumber,_accountName, _balance);
    }
}
