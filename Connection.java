package com.homework;

public class Connection implements AutoCloseable {
    Database db;

    Connection(Database db) throws ConnectionError
    {
        this.db = db;
        try {
            // Something went wrong
            throw new DBError();
        } catch (DBError dbError) {
            // rethrow
            throw new ConnectionError();
        }
    }

    public void printStatus() {
        System.out.println("Connection.printStatus");
    }

    @Override
    public void close()
    {
        System.out.println("Connection.close");
    }
}
