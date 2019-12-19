package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.factory.Android;
import com.bridgelabz.designpatternsown.factory.OperatingSystem;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Main of Operating system
 *  
 ****************************************************************************************/
public class MainOfOperatingSystem
{
	public static void main(String[] args) 
	{
		
	OperatingSystem os=new Android(); // We are providing implementation here itself
									  // but in future if you want to change it
									 // from android to ios then you have to change the code
									 // that means client can get to know what we are using
	os.userManual();
	}
}