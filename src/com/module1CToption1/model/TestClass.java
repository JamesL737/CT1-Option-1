package com.module1CToption1.model;

public class TestClass {

	public static void main(String[] args) {
		
		CheckingAccount myAccount = new CheckingAccount();
		
		//test setting account info
		myAccount.setFirstName("Arthur");
		myAccount.setLastName("Claudeland");
		myAccount.setAccountID(147258);
		myAccount.accountSummary();
		System.out.println();
		
		//test deposit
		System.out.println("Depositing $25.00");
		myAccount.deposit(25.00);
		myAccount.displayAccount();
		System.out.println();
		
		//test withdraw
		System.out.println("Withdrawing $10.00");
		myAccount.processWithdrawl(10.00);
		myAccount.accountSummary();
		System.out.println();
		
		//overdraft withdraw
		System.out.println("Withdrawing $20.00");
		myAccount.processWithdrawl(20.00);
		System.out.println();

	}

}
