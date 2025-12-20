package com.behavioral.strategy.solution;

import com.behavioral.strategy.solution.strategy.PaymentStrategy;

// Context class - holds reference to a strategy object
public class ShopingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(double amount) {
        System.out.print(this.paymentStrategy.getClass().getSimpleName() + ": ");
        paymentStrategy.pay(amount);
    }


}
