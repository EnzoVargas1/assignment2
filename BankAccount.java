package com.meritamerica.assignment2;

public class BankAccount {
	
	private double balance;
	private double interestRate;
	private long accountNumber;
	
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	BankAccount( double balance){
		this.balance = balance;
    }
	
	public long getAccountNumber() {
		return  accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public boolean withdraw(double amount) {
		if(amount < 0 && amount >= balance * -1) {
			balance+=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean deposit (double amount) {
		if(amount > 0) {
			balance +=amount;
			return true;
		}else {
			return false;
		}
	}
	
	public double futureValue(int years) {
		return balance * Math.pow(1 + interestRate, years);
	}






}
