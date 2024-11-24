package com.task;

import com.task.singleton.Logger;
import com.task.singleton.TestClass;
import com.task.factory.CoffeeMachine;
import com.task.factory.CoffeeType;
import com.task.adapter.Computer;
import com.task.adapter.MemoryCard;
import com.task.adapter.Usb;
import com.task.adapter.UsbAdapter;
import com.task.proxy.DatabaseProxy;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Logger logger = Logger.getInstance();
        logger.classLogg(new TestClass(), "Some info");

        //Factory
        /*CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start(CoffeeType.AMERICANO);*/

        //Adapter
        /*Computer computer = new Computer();
        Usb usb = new Usb();
        computer.read(usb);

        MemoryCard memoryCard = new MemoryCard();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);
        computer.read(usbAdapter);*/

        //Proxy
        /*DatabaseProxy databaseProxy = new DatabaseProxy("myDatabase");
        databaseProxy.connect();*/
    }
}