package com.task.factory;

public class CoffeeMachine {

    public void start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        ICoffee iCoffee = coffeeFactory.getCoffee(coffeeType);
        iCoffee.makeCoffee();
    }
}
