package com.critional.deaign.Decorator;

public class PlainPizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Plan Pizza";
    }

    @Override
    public double getCost() {
        return 200.00;
    }
}
