package com.stractural.facade;

public class OrderFacade {
    private final InventoryService inventory;
    private final PaymentService payment;
    private final ShippingService shoping;
    private final NotificationService notification;

    public OrderFacade(){
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.shoping = new ShippingService();
        this.notification = new NotificationService();
    }
    // Simplified method for clients

    public void placeOrder(String productId, String paymentMethod){
        // This following step are hiden from the clint and need to be executed in a specific order
        System.out.println("Planing order for product: "+productId);

        // Step 1: Check stock
        if (!inventory.checkStock(productId)){
            System.out.println("Product out of stock!");
            return;
        }
        //Step 2 Make payment
        if (!payment.makePayment(paymentMethod)){
            System.out.println("Payment failed!");
            return;
        }
        // Step 3: Ship product
        shoping.shipProduct(productId);

        // Step 4: Send confirmation
        notification.sendConfirmation(productId);

        System.out.println("Order place successfully!");
    }

}
