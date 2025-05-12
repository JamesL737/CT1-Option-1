package com.module1CToption1.model;

public class BankAccount {

	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	
	//default constructor
	public BankAccount() {
		this.balance = 0.0;
	}
	
	public void deposit(double depoVal) {
		balance += depoVal;
	}
	
	public void withdrawl(double amount) {
		balance -= amount;
	}
	
	public void setFirstName(String fName) {
		firstName = fName;
	}
	
	public void setLastName(String lName) {
		lastName = lName;
	}
	
	public void setAccountID(int id) {
		accountID = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void accountSummary() {
		System.out.println("Name: " + getFirstName() + " " + getLastName());
		System.out.println("ID: " + getAccountID());
		System.out.println("Balance: $" + getBalance());
	}
}
