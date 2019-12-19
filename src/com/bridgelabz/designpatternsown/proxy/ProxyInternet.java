package com.bridgelabz.designpatternsown.proxy; 
import java.util.ArrayList; 
import java.util.List; 
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:ProxyInternet implementing CollegeInternet 
 * 
 ****************************************************************************************/
public class ProxyInternet implements CollegeInternet 
{ 
	private CollegeInternet internet = new AccessInternet(); 
	private static List<String> bannedSites; 
	
	static
	{ 
		bannedSites = new ArrayList<String>(); 
		bannedSites.add("facebook.com"); 
		bannedSites.add("twitter.com"); 
		bannedSites.add("games.com"); 
		
	} 

	public void connectTo(String serverhost) throws Exception 
	{ 
		if(bannedSites.contains(serverhost.toLowerCase())) 
		{ 
			throw new Exception("404 Access Error(No Permission)"); 
		} 
		internet.connectTo(serverhost); 
	} 

} 
