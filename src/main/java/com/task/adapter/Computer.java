package com.task.adapter;

public class Computer {

    public void read(IUsb iUsb) {
        iUsb.set();
        System.out.println("Информация с устройства прочитана");
    }
}
