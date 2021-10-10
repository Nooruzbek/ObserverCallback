package com.company;

public class PolitNachrichtType implements InfoType{

	private String polNachricht;

	public PolitNachrichtType(String polNachricht) {
		super();
		this.polNachricht = polNachricht;
	}

	public void setPolNachricht(String newNachricht){
		this.polNachricht = newNachricht;
	}

	@Override
	public String getInfo() {
		return polNachricht;
	}
}
