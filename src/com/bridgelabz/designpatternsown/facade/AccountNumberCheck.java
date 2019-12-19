package com.bridgelabz.designpatternsown.facade;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Checking Account Number 
 * 
 ****************************************************************************************/
public class AccountNumberCheck {
	private int accountNumber = 26050796;
	public int getAccountNumber() {
		return accountNumber;
	}
	public boolean accountActive(int acctNumToCheck) {
		if (acctNumToCheck == getAccountNumber()) {
			return true;
		} else {
			return false;
		}
	}
}