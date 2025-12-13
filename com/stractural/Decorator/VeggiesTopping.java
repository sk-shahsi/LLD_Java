package com.stractural.Decorator;

public class VeggiesTopping extends ToppingDecorator{
    @Override
    public String getDescription() {
        return pizza.getDescription()+ "Veggies";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+ 30;
    }
    public VeggiesTopping(BasePizza pizza){
        super(pizza);
    }
}
