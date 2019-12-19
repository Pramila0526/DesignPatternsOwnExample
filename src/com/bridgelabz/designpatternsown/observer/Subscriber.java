package com.bridgelabz.designpatternsown.observer;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Subscriber Of Observer
 * 
 ****************************************************************************************/
public class Subscriber implements Observer {
	 private  String name;
	private Channel channel;
	
	public Subscriber(String name) {
		super();
		this.name=name;
	}
	
	public  void getUpdate()
	{
		System.out.println("Hey " +name+ " Video Uploaded of" +channel.title );
	}
	
	public void subscribeChannel(Channel channel)
	{
		this.channel=channel;
	}

}
