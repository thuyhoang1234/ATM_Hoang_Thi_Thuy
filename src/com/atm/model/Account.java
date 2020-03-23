package com.atm.model;
public class Account {
	private int accountNumber;	
	private int passWord;
	private String customer;
	private double balance;
	private String currency;
	private String branch;
	
	public Account() {
		this.accountNumber = 0;
		this.passWord = 001;
		this.customer = "";
		this.balance = 1.0;
		this.currency = "VND";
		this.branch = "";
	}
	public Account(int accountNumber, int passWord, String customer,
    		double balance, String currency,  String branch) {
		this.accountNumber = accountNumber;
		this.passWord = passWord;
		this.customer = customer;
		this.balance = balance; 
		this.currency = currency;
		this.branch = branch;
	}
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public boolean Withdrawal(double balance){
	    if(balance < this.balance){
	        this.balance -=balance;
	        return true;
	    }else
	        return false;
	}
	public boolean Recharge(double balance){
	    if(balance > 0){
	        this.balance +=balance;
	        return true;
	    }else
	        return false;
	} 
	  
}

