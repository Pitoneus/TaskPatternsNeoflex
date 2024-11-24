package com.task.factory;

public class Americano implements ICoffee {

    @Override
    public void makeCoffee() {
        System.out.println("Американо готовится");
    }
}
