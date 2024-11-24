package com.task.proxy;

public class DatabaseProxy implements IDatabase {

    private String dbName;

    public DatabaseProxy(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        String fullUrl = "localhost:port/" + dbName;
        DatabaseImpl database = new DatabaseImpl(fullUrl);
        database.connect();
    }
}
