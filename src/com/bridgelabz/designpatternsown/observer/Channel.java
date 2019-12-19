package com.bridgelabz.designpatternsown.observer;
import java.util.ArrayList;
import java.util.List;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Channel class of Subject
 * 
 ****************************************************************************************/
public class Channel implements Subject {
	private List<Subscriber> subscribers = new ArrayList<>();
	String title;

	@Override
	public void subscribe(Subscriber sub) {
		subscribers.add(sub);
	}

	@Override
	public void unSubscribe(Observer sub) {
		subscribers.remove(sub);
	}

	@Override
	public void notifySubscribers() {
		for (Observer sub : subscribers) {
			sub.getUpdate();
		}
	}

	@Override
	public void uploadVideo(String titleName) {
		this.title = titleName;
		notifySubscribers();
	}

}
