package com.critional.deaign.Decorator;

public abstract class ToppingDecorator implements BasePizza {
BasePizza pizza;

public ToppingDecorator(BasePizza pizza){
    this.pizza = pizza;
}
}
