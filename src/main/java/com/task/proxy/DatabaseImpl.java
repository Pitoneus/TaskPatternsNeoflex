package com.task.proxy;

public class DatabaseImpl implements IDatabase {

    private String fullUrl;

    public DatabaseImpl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    @Override
    public void connect() {
        System.out.println("Подключено к базе данных " + fullUrl);
    }
}
