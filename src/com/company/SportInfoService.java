package com.company;

public class SportInfoService extends Subject<SportInfoType>{

	public void newNewsItem(String news){
		SportInfoType info = new SportInfoType(news);
		addType(info);
		notifyObservers();
	}
}
