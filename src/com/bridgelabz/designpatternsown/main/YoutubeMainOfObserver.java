package com.bridgelabz.designpatternsown.main;
import com.bridgelabz.designpatternsown.observer.Channel;
import com.bridgelabz.designpatternsown.observer.Subscriber;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Main of Observer
 * 
 ****************************************************************************************/
public class YoutubeMainOfObserver {
	public static void main(String[] args) {
		Channel bridgelabz = new Channel();
		Subscriber s1 = new Subscriber("Aishwarya");
		Subscriber s2 = new Subscriber("Pramila");
		Subscriber s3 = new Subscriber("Sonam");
		Subscriber s4 = new Subscriber("Supriya");
		Subscriber s5 = new Subscriber("Surbhi");
		Subscriber s6 = new Subscriber("Pranali");

		bridgelabz.subscribe(s1);
		bridgelabz.subscribe(s2);
		bridgelabz.subscribe(s3);
		bridgelabz.subscribe(s4);
		bridgelabz.subscribe(s5);
		bridgelabz.subscribe(s6);

		bridgelabz.unSubscribe(s3);
		s1.subscribeChannel(bridgelabz);
		s2.subscribeChannel(bridgelabz);
		s3.subscribeChannel(bridgelabz);
		s4.subscribeChannel(bridgelabz);
		s5.subscribeChannel(bridgelabz);
		s6.subscribeChannel(bridgelabz);

		bridgelabz.uploadVideo(" Fellowship Programmings");
	}
}