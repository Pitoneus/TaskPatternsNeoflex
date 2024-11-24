package com.task.factory;

public class Espresso implements ICoffee {

    @Override
    public void makeCoffee() {
        System.out.println("Эспрессо готовится");
    }
}
