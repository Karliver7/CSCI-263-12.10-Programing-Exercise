package com.Classes;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> _list = new ArrayList<>();

    private int search(String input){
        var output = _list.stream().filter(a -> a.getAccountNumber().equals(input)).findFirst();

        return output.isPresent() ? _list.indexOf(output.get()) : -1;
    }

    public int getTotal(){
        return _list.size();
    }
    public BankAccount getItem(String accountNumber){
        var result = search(accountNumber);

        return result == -1 ? null : _list.get(result);
    }
    public boolean addAccount(String accountNumber, String accountName){
        if (search(accountNumber) != -1)
            return false;

        _list.add(new BankAccount(accountNumber, accountName));
        return true;
    }
    public boolean depositMoney(String accountNumber, double d){
        var account = getItem(accountNumber);

        if (account == null)
            return false;

        account.deposit(d);
        return true;
    }
    public boolean withdrawMoney (String accountNumber, double w){
        var account = getItem(accountNumber);

        if (account == null)
            return false;

        return account.withdraw(w);
    }
    public boolean removeAccount(String accountNumber){
        var account = getItem(accountNumber);

        if (account == null)
            return false;

        _list.remove(account);
        return true;
    }

    @Override
    public String toString(){
        return _list.toString();
    }
}