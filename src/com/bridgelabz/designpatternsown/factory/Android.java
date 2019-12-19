package com.bridgelabz.designpatternsown.factory;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Android Class implementing OS
 * 
 ****************************************************************************************/
public class Android implements OperatingSystem
{
	public void userManual() 
	{
		System.out.println("Android is a mobile operating system based on "
							+ "\na modified version of the Linux kernel and "
							+ "\nother open source software, designed primarily "
							+ "\nfor touchscreen mobile devices such as smartphones and tablets");
	}
}
