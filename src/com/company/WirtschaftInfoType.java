package com.company;

public class WirtschaftInfoType implements InfoType{
	private String wirtschaftInfo;

	public WirtschaftInfoType(String wirtschaftInfo) {
		super();
		setNewWirtschaftNews(wirtschaftInfo);
	}

	public void setNewWirtschaftNews(String newNews){
		this.wirtschaftInfo = newNews;
	}

	@Override
	public String getInfo() {
		return wirtschaftInfo;
	}
}
