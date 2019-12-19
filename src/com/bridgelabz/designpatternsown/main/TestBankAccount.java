package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.facade.BankAccountFacade;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Main of Bank Account
 * 
 ****************************************************************************************/
public class TestBankAccount {
	public static void main(String[] args){
		BankAccountFacade accessingBank = new BankAccountFacade(26050796, 1234);
		accessingBank.withdrawCash(50.00);
		accessingBank.withdrawCash(100.00);
	}	
}