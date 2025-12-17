package com.behavioral.observer.notifysystem.observer;

public class PushNotificationObserver implements StockNotificationObserver{
    private final String userId;
    private final String deviceToken;


    public PushNotificationObserver(String userId, String deviceToken) {
        this.userId = userId;
        this.deviceToken = deviceToken;
    }

    private void sendPushNotification() {
        System.out.println("!! PUSH NOTIFICATION SENT to: " + deviceToken + " - " + "Product is back in stock! Hurry Up!!");
    }


    @Override
    public void update() {
        sendPushNotification();

    }

    @Override
    public String getNotificationMethod() {
        return "Push Notification";
    }

    @Override
    public String getUserId() {
        return getUserId();
    }
}
