package com.bridgelabz.designpatternsown.factory;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Windows Class implementing OS
 * 
 ****************************************************************************************/
public class Windows implements OperatingSystem
{
	public void userManual()
	{
		System.out.println("Microsoft Windows, commonly referred to as Windows, "
							+ "\nis a group of several proprietary graphical operating system families, "
							+ "\nall of which are developed and marketed by Microsoft. Each family caters "
							+ "\nto a certain sector of the computing industry. Active Microsoft Windows "
							+ "\nfamilies include Windows NT and Windows IoT");
	}
}
