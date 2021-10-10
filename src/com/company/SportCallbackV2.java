package com.company;

public class SportCallbackV2 implements Callback<SportInfoType>{
	@Override
	public void call(SportInfoType info) {
		System.out.println("Neue Nachricht von der Sportwelt: " + info.getInfo());
	}
}
