package com.task.factory;

public class CoffeeFactory {

    public ICoffee getCoffee(CoffeeType coffeeType) {
        ICoffee iCoffee;
        switch (coffeeType) {
            case ESPRESSO -> iCoffee = new Espresso();
            case AMERICANO -> iCoffee = new Americano();
            default -> throw new IllegalArgumentException("Неверный тип кофе");
        }
        return iCoffee;
    }
}
