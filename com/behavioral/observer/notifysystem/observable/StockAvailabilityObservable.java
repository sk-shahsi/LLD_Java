package com.behavioral.observer.notifysystem.observable;
//Observable interface
public interface StockAvailabilityObservable {
    void addStockObserver(StockAvailabilityObservable observer);
    void removeStockObserver(StockAvailabilityObservable observer);
    void notifyStockObserver();
    boolean purchase(int quantity);
    void restock(int quantity);
}
