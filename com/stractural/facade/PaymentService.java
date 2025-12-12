package com.stractural.facade;

public class PaymentService {
    public boolean makePayment(String paymentMethod){
        System.out.println("Processing payments :"+paymentMethod);

        return  true;
    }
}
