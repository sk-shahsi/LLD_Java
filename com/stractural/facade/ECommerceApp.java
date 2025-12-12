package com.stractural.facade;

public class ECommerceApp {
    public static void main(String[] args) {
        System.out.println("==== Facade Design Patter Demo ====");
        // Clint interacts with a simple Facade, not with all subsystem.
        OrderFacade orderFacade = new OrderFacade();

        // Place order with one call to Facade

        orderFacade.placeOrder("MacBook Pro", "Credit Card");

        // place another order with one call to Facade

        orderFacade.placeOrder("Cricket Bat" ,"UPI");
    }
}
