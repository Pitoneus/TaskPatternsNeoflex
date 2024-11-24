package com.task.adapter;

public class Usb implements IUsb {

    @Override
    public void set() {
        System.out.println("USB подключено");
    }
}
