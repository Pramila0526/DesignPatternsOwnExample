package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.factory.OpeartingSystemFactory;
import com.bridgelabz.designpatternsown.factory.OperatingSystem;
import com.bridgelabz.designpatternsown.utility.Utility;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Main of Operating system Using Factory Class
 * 
 ****************************************************************************************/
public class MainOfOperatingSystemUsingFactory
{
	public static void main(String[] args) 
	{
		OpeartingSystemFactory osf=new OpeartingSystemFactory();
		System.out.println("Which type of OS Platform do you want");
		String platform=Utility.stringInput().toLowerCase();
		OperatingSystem os=osf.getInstance(platform);
		os.userManual();
	}
}