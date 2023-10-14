package src.main.java.com.creational.factory.databaseConnections;

public class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL Database");
    }
}
