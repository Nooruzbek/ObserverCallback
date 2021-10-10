package com.company;

public class PolitNachrichtService extends Subject<PolitNachrichtType>{

	public void setNewNews(String news){
		PolitNachrichtType politNachrichtType = new PolitNachrichtType(news);
		addType(politNachrichtType);
		notifyObservers();
	}
}
