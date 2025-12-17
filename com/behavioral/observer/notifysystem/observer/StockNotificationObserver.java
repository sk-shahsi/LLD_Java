package com.behavioral.observer.notifysystem.observer;

public interface StockNotificationObserver {
    void update();

    String getNotificationMethod();

    String getUserId();

}
