package com.homework;

public class Main {

    public static int tryConnect(String dbAddr)
    {
        try (Database db = new Database(dbAddr);
             Connection conn = new Connection(db)) {
            conn.printStatus();
        } catch (ConnectionError connError) {
            System.out.println("Error opening connection: " + connError.getMessage());
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        if (tryConnect("127.0.0.1") == 0)
            System.out.println("db ok");
        else
            System.out.println("db error");
    }
}
