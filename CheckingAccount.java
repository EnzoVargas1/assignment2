package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {
	
	private double balance;
	private double interestRate;
	private long accountNumber;

	CheckingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
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