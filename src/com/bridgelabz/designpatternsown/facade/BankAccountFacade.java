package com.bridgelabz.designpatternsown.facade;
// The Facade Design Pattern decouples or separates the client 
// from all of the sub components
// The Facades aim is to simplify interfaces so you don't have 
// to worry about what is going on
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Bank Account Facade
 * 
 ****************************************************************************************/
public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int newAcctNum, int newSecCode){
		
		accountNumber = newAcctNum;
		securityCode = newSecCode;
		
		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
		
	}
	
	public int getAccountNumber() { return accountNumber; }
	
	public int getSecurityCode() { return securityCode; }
	
	
	public void withdrawCash(double cashToGet){
		
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode()) &&
				fundChecker.haveEnoughMoney(cashToGet)) {
					
					System.out.println("Transaction Completed Successfully\n");
					
				} else {
					
					System.out.println("Transaction Failed due to low balance or invalid Id Password\n");
					
				}
		
	}
	
	
	public void depositCash(double cashToDeposit){
		
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode())) {
			
					fundChecker.makeDeposit(cashToDeposit);
					
					System.out.println("Transaction Completed successfully!!!!!\n");
					
				} else {
					
					System.out.println("Transaction Failed due to invalid Id Password\n");
					
				}
		
	}
	
}