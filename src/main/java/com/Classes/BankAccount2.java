package com.Classes;

public class BankAccount2 {
    private String _accountNumber;
    private String _accountName;
    private double _balance;
    private static double _interestRate = 0.0;

    public BankAccount2(String accountNumber, String accountName){
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

    public static void setInterestRate(double interestRate){
        _interestRate = interestRate;
    }
    public static double getInterestRate(){
        return _interestRate;
    }
    public void addInterest(){
        _balance += (_balance * _interestRate) / 100;
    }
}
