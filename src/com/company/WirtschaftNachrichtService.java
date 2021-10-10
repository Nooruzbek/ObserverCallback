package com.company;

public class WirtschaftNachrichtService extends Subject<WirtschaftInfoType>{

	public void setNewsItem(String news){
		WirtschaftInfoType info = new WirtschaftInfoType(news);
		addType(info);
		notifyObservers();
	}
}
