package com.UnitTests;

import com.Classes.*;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var myBank = new Bank();

        loop : while (true){
            System.out.print("""
                    1. Create new account
                    2. Remove an account
                    3. Deposit money
                    4. Withdraw money
                    5. Check account details
                    6. List All Accounts
                    7. Quit
                    
                    Enter choice [1-7]:\s""");

            switch (input.nextLine()){
                case "1":
                    System.out.print("\n\nEnter account number: ");
                    var accountNumber = input.nextLine();

                    System.out.print("Enter account name: ");
                    var accountName = input.nextLine();

                    if (myBank.addAccount(accountNumber, accountName))
                        System.out.println("Account added");
                    else
                        System.out.println("Account number already exists");
                    break;
                case "2":
                    System.out.print("\n\nEnter account number: ");

                    if (myBank.removeAccount(input.nextLine()))
                        System.out.println("Account removed");
                    else
                        System.out.println("Account number doesn't exist");
                    break;
                case "3":
                    System.out.print("\n\nEnter account number: ");
                    accountNumber = input.nextLine();

                    System.out.print("Enter amount to deposit: ");
                    myBank.depositMoney(accountNumber, input.nextDouble());
                    System.out.println();
                    break;
                case "4":
                    System.out.print("\n\nEnter account number: ");
                    accountNumber = input.nextLine();

                    System.out.print("Enter amount to withdraw: ");
                    myBank.withdrawMoney(accountNumber, input.nextDouble());
                    System.out.println();
                    break;
                case "5":
                    System.out.print("\n\nEnter account number: ");
                    var account = myBank.getItem(input.nextLine());

                    if (account == null)
                        System.out.println("Account doesn't exist");
                    else{
                        System.out.println(account);
                    }
                    break;
                case "6":
                    System.out.println(myBank);
                    break;
                case "7":
                    break loop;
                default:
                    System.out.println("Unknown entry try again.");
                    break;
            }
        }
    }

}
