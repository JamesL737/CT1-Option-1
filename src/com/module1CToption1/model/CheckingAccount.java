package com.module1CToption1.model;

public class CheckingAccount extends BankAccount {
	
	private double interestRate = 1.2;
	
	public void processWithdrawl(double amount) {
		withdrawl(amount);
		
		if(balance < 0.0) {
			balance -= 30.0;
			System.out.println("Current balance: $" + getBalance());
			System.out.println("Because you have overdrafted your account, a $30.0 fee has been applied.");
		}
	}
	
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate: " + interestRate + "%");
	}
	
}
