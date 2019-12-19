package com.bridgelabz.designpatternsown.factory;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Class  OS
 * 
 ****************************************************************************************/
public class OpeartingSystemFactory 
{
	public OperatingSystem getInstance(String str) 
	{
		if(str.equals("open"))
		{
			return new Android();
		}
		else if(str.equals("closed"))
		{
			return new IOS();
		}
		else if(str.equals("microsoft"))
		{
			return new Windows();
		}
		return null;
	}
}
