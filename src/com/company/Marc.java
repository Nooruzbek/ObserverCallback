package com.company;

public class Marc {

	public Marc(SportInfoService service) {
		super();
		service.addCallback(new SportCallbackV2());
	}
}
