package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.proxy.CollegeInternet;
import com.bridgelabz.designpatternsown.proxy.ProxyInternet;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Main of Students
 * 
 ****************************************************************************************/
public class Student 
{ 
	public static void main (String[] args) 
	{ 
		CollegeInternet internet = new ProxyInternet(); 
		try
		{ 
			internet.connectTo("journalDev.com"); 
			internet.connectTo("facebook.com"); 
		} 
		catch (Exception e) 
		{ 
			System.out.println(e.getMessage()); 
		} 
	} 
} 
