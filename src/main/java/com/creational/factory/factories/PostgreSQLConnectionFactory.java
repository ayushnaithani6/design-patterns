package src.main.java.com.creational.factory.factories;

import src.main.java.com.creational.factory.databaseConnections.DatabaseConnection;
import src.main.java.com.creational.factory.databaseConnections.PostgreSQLConnection;

public class PostgreSQLConnectionFactory implements ConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public void validateConnection() {
        System.out.println("PostgreSQL connection validated");
    }
}
