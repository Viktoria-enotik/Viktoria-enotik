package com.homework;

public class Database implements AutoCloseable {
    private String address;

    Database(String address)
    {
        this.address = address;
    }

    @Override
    public void close()
    {
        System.out.println("Database.close");
    }
}
