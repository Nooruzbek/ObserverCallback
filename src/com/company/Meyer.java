package com.company;

public class Meyer {

	private String observerName;

	public Meyer(String observerName, SportInfoService sportInfoService,
				 PolitNachrichtService politNachrichtService,
				 WirtschaftNachrichtService wirtschaftNachrichtService){
		super();
		this.observerName = observerName;
		sportInfoService.addCallback(new SportCallbackV2());
		politNachrichtService.addCallback(new PolitNachrichCallback());
		wirtschaftNachrichtService.addCallback(new WirtschaftNachrichtCallback());
	}

	public class PolitNachrichCallback implements Callback<PolitNachrichtType>{

		@Override
		public void call(PolitNachrichtType info) {
			System.out.println(observerName + " get news update: " + info.getInfo());
		}
	}

	public class WirtschaftNachrichtCallback implements Callback<WirtschaftInfoType>{

		@Override
		public void call(WirtschaftInfoType info) {
			System.out.println(observerName + " neue Nachricht von der Wirtschaftswelt : " + info.getInfo());
		}
	}

}
