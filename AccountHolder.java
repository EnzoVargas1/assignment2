package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount[] checkingAccount;
	private SavingsAccount[] savingsAccount;
	private CDAccount[] cdAccounts;
	private int count1;
	private int count2;
	private int count3;
	
	AccountHolder(String firstName, String middleName, String lastName, String ssn){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
		
		checkingAccount = new CheckingAccount[0];
		savingsAccount = new SavingsAccount[0];
		cdAccounts = new CDAccount[0];
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String name) {
		this.middleName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getSSN() {
		return this.ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
		count1++;
		CheckingAccount[] arr = new CheckingAccount[count1];
		
		for(int i = 0; i < checkingAccount.length; i++) {
			arr[i] = checkingAccount[i];
		}
		arr[arr.length-1] = new CheckingAccount(openingBalance);
	  
		return checkingAccount[checkingAccount.length-1];
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if(getCheckingBalance()  < 250000.00) {
			updateCheckingAccount(checkingAccount);
			return checkingAccount;
		}
		else {
			return checkingAccount;
		}
	}
	
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccount;
	}
	
	public int getNumberOfCheckingAccounts() {
		return count1;
	}
	
	public double getCheckingBalance() {
		int sum = 0;
		for(int i = 0; i < this.checkingAccount.length; i++) {
			sum+=this.checkingAccount[i].getBalance();
		}
		return sum;
	}



    private void updateCheckingAccount(CheckingAccount checkingAccount) {
    	count1++;
		CheckingAccount[] arr = new CheckingAccount[count1];
		
		for(int i = 0; i < this.checkingAccount.length; i++) {
			arr[i] = this.checkingAccount[i];
		}
		arr[arr.length-1] = checkingAccount;
		this.checkingAccount = arr;
	  
    }
    

    private void updateSavingsAccount(SavingsAccount savingsAccount) {
    	count2++;
		SavingsAccount[] arr = new SavingsAccount[count2];
		
		for(int i = 0; i < this.savingsAccount.length; i++) {
			arr[i] = this.savingsAccount[i];
		}
		arr[arr.length-1] = savingsAccount;
		this.savingsAccount = arr;
	  
    }
    
    private void updateCDAccounts(CDAccount cdAccount) {
    	count3++;
		CDAccount[] arr = new CDAccount[count3];
		
		for(int i = 0; i < this.cdAccounts.length; i++) {
			arr[i] = this.cdAccounts[i];
		}
		arr[arr.length-1] = cdAccount;
		this.cdAccounts = arr;
    }
    
    
    public SavingsAccount addSavingsAccount(double openingBalance) {
    	if(getCheckingBalance()  < 250000.00) {
    		updateSavingsAccount(new SavingsAccount(openingBalance));
			return new SavingsAccount(openingBalance);
		}
		else {
			return new SavingsAccount(openingBalance);
		}
    }

    
    public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
    	if(getCheckingBalance()  < 250000.00) {
    		updateSavingsAccount(savingsAccount);
			return savingsAccount;
		}
		else {
			return savingsAccount;
		}
    }


	public SavingsAccount[] getSavingsAccounts() {
		return this.savingsAccount;
	}
	
	public int getNumberOfSavingsAccounts() {
		return count2;
	}
    
	
	public double getSavingsBalance() {
		int sum = 0;
		for(int i = 0; i < this.savingsAccount.length; i++) {
			sum+=this.savingsAccount[i].getBalance();
		}
		return sum;
	}

	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		updateCDAccounts(new CDAccount(offering, openingBalance));
		return new CDAccount(offering, openingBalance);
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		updateCDAccounts(cdAccount);
		return cdAccount;
		
	}
	
	public CDAccount[] getCDAccounts() {
		return this.cdAccounts;
	}
	
	public int getNumberOfCDAccounts() {
		return count3;
	}
	
	public double getCDBalance() {
		int sum = 0;
		for(int i = 0; i < this.cdAccounts.length; i++) {
			sum+=this.cdAccounts[i].getBalance();
		}
		return sum;
	}
	
	public double getCombinedBalance() {
		return this.getCheckingBalance() + this.getSavingsBalance();
	}




	
	


	
	






	
}