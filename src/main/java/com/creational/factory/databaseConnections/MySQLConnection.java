package src.main.java.com.creational.factory.databaseConnections;

public class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL Database");
    }
}
