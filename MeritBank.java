package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	private static AccountHolder[] accountHolders = new AccountHolder [0];
	private static CDOffering[] cdOfferings = new CDOffering[0];
	private static int count;
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		count++;
		AccountHolder[] arr = new AccountHolder[count];
		
		for(int i = 0; i < accountHolders.length; i++) {
			arr[i] = accountHolders[i];
		}
		arr[arr.length-1] = accountHolder;
		accountHolders = arr;
	}
	
	public static AccountHolder[] getAccountHolders() {
		return  accountHolders;  
	}
	
	public static CDOffering[] getCDOfferings() {
		return cdOfferings;
	}
	
	public static CDOffering getBestCDOffering(double depositAmount) {
		
	}
	
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		
	}
	
	public static void clearCDOfferings() {
		
	}
	
	public static void setCDOfferings(CDOffering[] offerings) {
		cdOfferings = offerings;
	}
	
	public static long getNextAccountNumber() {
		
	}
	
	public static double totalBalances() {
		
	}
	
	public static double futureValue(double presentValue, double interestRate, int term) {
		
	}	

}
