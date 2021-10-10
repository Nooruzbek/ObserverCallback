package com.company;

public class Main {

    public static void main(String[] args) {
        SportInfoService sportInfo = new SportInfoService();
        PolitNachrichtService nachricht = new PolitNachrichtService();
        WirtschaftNachrichtService wirtschaftService = new WirtschaftNachrichtService();

        new Meyer("huhu", sportInfo, nachricht, wirtschaftService);

        new Marc(sportInfo);

        sportInfo.newNewsItem("Etwas");
        sportInfo.newNewsItem("Bla bla bla");
        nachricht.setNewNews("new etwas");
        wirtschaftService.setNewsItem("es muss etwas geschehen!");
    }
}
