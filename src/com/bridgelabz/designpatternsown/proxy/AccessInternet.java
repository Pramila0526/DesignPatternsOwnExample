package com.bridgelabz.designpatternsown.proxy; 
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Internet Access Implementong College Internet
 * 
 ****************************************************************************************/
public class AccessInternet implements CollegeInternet 
{ 
	public void connectTo(String serverhost) 
	{ 
		System.out.println("Connecting to "+ serverhost); 
	} 
} 
