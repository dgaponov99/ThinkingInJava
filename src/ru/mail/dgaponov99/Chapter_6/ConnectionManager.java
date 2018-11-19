package ru.mail.dgaponov99.Chapter_6;

public class ConnectionManager {
    private ConnectionManager() {}

    private static int count;
    private static int n = 5;
    private static Connection[] connections = new Connection[n];

    public static Connection getConnection() {
        count++;
        if (count > n)
            return null;

        connections[count-1] = Connection.makeConnection();
        return connections[count - 1];
    }
}

class Connection {

    private Connection() {}

    static Connection makeConnection() {
        return new Connection();
    }

    @Override
    public String toString() {
        return "Connection.class";
    }
}
