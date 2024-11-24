package com.task.adapter;

public class MemoryCard implements IMemoryCard {

    @Override
    public void set() {
        System.out.println("Карта памяти подключена");
    }
}
