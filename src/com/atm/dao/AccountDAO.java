package com.atm.dao;

import java.util.Scanner;

import com.atm.model.Account;

public class AccountDAO {
    public boolean transfers(Account account1, Account account2){
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount to transfer: ");
		double balance = scanner.nextDouble();
		return account1.Withdrawal(balance)&&account2.Recharge(balance);
    }    
    
    public void accountInformation(Account account){
        System.out.println("AccountNumber : " + account.getAccountNumber());
        System.out.println("Customer : " + account.getCustomer());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Currency : " + account.getCurrency());
        System.out.println("Branch : " + account.getBranch());
    }    
    public boolean Withdrawal(Account account){
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Please enter the amount to withdraw: ");
		double balance = scanner.nextDouble();
		return account.Withdrawal(balance);
    }       
    public Account newAccount(int accountNumber, int passWord, String customer,
    		double balance, String currency,  String branch){
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setPassWord(passWord);
        account.setCustomer(customer);
        account.setBalance(balance);
        account.setCurrency(currency);
        account.setBranch(branch);
        return account;
   }
    
}
