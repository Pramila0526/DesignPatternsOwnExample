package com.bridgelabz.designpatternsown.observer;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Observer Interface
 * 
 ****************************************************************************************/
public interface Observer {
	void getUpdate();

	void subscribeChannel(Channel channel);
}