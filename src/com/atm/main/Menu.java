package com.atm.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.atm.dao.AccountDAO;
import com.atm.model.Account;

public class Menu {
	public Menu() {
		AccountDAO accountDAO = new AccountDAO();
		System.out.println("ATM tree emulation program");
		Scanner scanner = new Scanner(System.in);
		Account account1 = accountDAO.newAccount(001,123,"Hoang Thi Thuy",2000000,"VND","Vietcombank");
		System.out.println("Login");
		System.out.print("Please enter your account number: ");
		int accountNumber = scanner.nextInt();
		System.out.print("Please enter a password: ");
		int passWord = scanner.nextInt(); 
		if(account1.getAccountNumber() == accountNumber && account1.getPassWord() == passWord) {
			System.out.println("Logged in successfully");
			String choice="y";
			while(choice.equalsIgnoreCase("y")){
				 System.out.println("Please select to perform function: ");
			    
			     System.out.println("1. Account information");
			     System.out.println("2. Withdrawal");
			     System.out.println("3. Transfer");
			     System.out.println("4. Exit");
			     int lc = 0;
			     try{
			    	 	lc = scanner.nextInt();
		         } catch (InputMismatchException ime){
		                System.out.println("You must enter a whole number, please enter");
		                new Menu();
		         }
			     switch(lc)
			     {
			        
			        case 1: 
			        	 accountDAO.accountInformation(account1);
			        	 break;
			        case 2: 
			            if (accountDAO.Withdrawal(account1)){
			                System.out.println("Please wait to receive the money");
			            }else
			                System.out.println("Request failed");   
			            break;
			        case 3: 
			        	Account account2 = new Account(002,123,"Nguyen Thi Mai",2000000,"VND","Vietcombank");
			            if(accountDAO.transfers(account1, account2))
			            {
			                System.out.println("Amount was transferred");
			            }else
			                System.out.println("Request failed");
			            break;
			        case 4:
						try {
							Thread.sleep(1000);
							return;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        default:
			        	System.out.println("Selection does not match");
			            break;
			     }
			     System.out.println("Do you want to continue? (Y/N)");
			     choice = scanner.next();
			     System.out.println();   
			}
		
		}else {
			System.out.println("Login failed, please retype");	
			new Menu();
		}
		
	}
	public static void main(String[] args){
		new Menu();
	}

}
