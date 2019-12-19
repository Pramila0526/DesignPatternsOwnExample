package com.bridgelabz.designpatternsown.observer;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Subject Interface
 * 
 ****************************************************************************************/
public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubscribers();

	void uploadVideo(String titleName);

}