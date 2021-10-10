package com.company;

public class SportInfoType implements InfoType {

	private String info;

	public SportInfoType(String info) {
		super();
		this.info = info;
	}

	public void setInfo(String newInfo){
		this.info = newInfo;
	}

	@Override
	public String getInfo() {
		return info;
	}

}
