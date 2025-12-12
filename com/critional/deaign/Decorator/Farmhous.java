package com.critional.deaign.Decorator;

public class Farmhous implements BasePizza{
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 300;
    }
}
